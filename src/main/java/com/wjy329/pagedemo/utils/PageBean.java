package com.wjy329.pagedemo.utils;

import java.util.List;

public class PageBean<T> {
    //起始
    private int offset;
    // 当前页
    private int currentPage;
    // 每页显示的数据量
    private int pageCount;
    // 总记录数
    private int totalCount;
    // 总页数 = 总记录数 / 每页显示的行数  (+ 1)
    private int totalPage;
    // 分页查询到的数据
    private List<T> pageData;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    // 返回总页数
    public int getTotalPage() {
        if (totalCount % pageCount == 0) {
            totalPage = totalCount / pageCount;
        } else {
            totalPage = totalCount / pageCount + 1;
        }
        return totalPage;
    }
    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }
    public void setCurrentPage(int currentPage){
        this.currentPage = currentPage;
    }
    public int getPageCount() {
        return pageCount;
    }
    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public List<T> getPageData() {
        return pageData;
    }
    public void setPageData(List<T> pageData) {
        this.pageData = pageData;
    }
}
