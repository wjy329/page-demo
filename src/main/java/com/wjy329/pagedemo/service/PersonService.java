package com.wjy329.pagedemo.service;

import com.wjy329.pagedemo.entity.Person;
import com.wjy329.pagedemo.utils.PageBean;

import java.util.List;

public interface PersonService {
     PageBean queryByPage(Integer currentPage, Integer pageCount);
}
