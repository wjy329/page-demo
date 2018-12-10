package com.wjy329.pagedemo.service.impl;

import com.wjy329.pagedemo.dao.PersonDao;
import com.wjy329.pagedemo.entity.Person;
import com.wjy329.pagedemo.service.PersonService;
import com.wjy329.pagedemo.utils.PageBean;
import com.wjy329.pagedemo.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Override
    public PageBean queryByPage(Integer currentPage,Integer pageCount) {
        Integer total = 0;
        List<Person> persons  = null;
        total = this.personDao.getAllCnt();
        PageBean pageBean = PageUtils.getPage(currentPage,pageCount,total);
        persons = this.personDao.findAllByPage(pageBean);
        pageBean.setPageData(persons);
        return pageBean;
    }
}
