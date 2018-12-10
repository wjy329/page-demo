package com.wjy329.pagedemo.controller;

import com.wjy329.pagedemo.entity.Person;
import com.wjy329.pagedemo.service.PersonService;
import com.wjy329.pagedemo.utils.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/getAll")
    @ResponseBody
    public PageBean getAll(Integer currentPage, Integer pageCount){
        PageBean list = personService.queryByPage(currentPage, pageCount);
        return list;
    }
}
