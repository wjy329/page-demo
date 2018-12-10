package com.wjy329.pagedemo.dao;

import com.wjy329.pagedemo.entity.Person;
import com.wjy329.pagedemo.utils.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonDao {
    List<Person> findAllByPage(@Param(value="page")PageBean page);

    Integer getAllCnt();
}
