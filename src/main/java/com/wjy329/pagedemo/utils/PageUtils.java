package com.wjy329.pagedemo.utils;

import java.util.List;

public class PageUtils {
    public static PageBean getPage(Integer currentPage, Integer pageCount, Integer total){
        PageBean pageBean = new PageBean();
        //如果传入的当前页面为空，那么默认为第一页
        if(currentPage == null){
            currentPage = 1;
        }
        //如果传入的数据量为空，默认显示5条
        if(pageCount == null){
            pageCount = 5;
        }
        //起始位置的计算
        int offset  = (currentPage-1)*pageCount;
        pageBean.setCurrentPage(currentPage);
        pageBean.setPageCount(pageCount);
        pageBean.setTotalCount(total);
        pageBean.setOffset(offset);

        return pageBean;
    }
}
