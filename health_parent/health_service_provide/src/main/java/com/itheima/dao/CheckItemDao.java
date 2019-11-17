package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.pojo.CheckItem;

public interface CheckItemDao {
    public void add(CheckItem checkItem);

    Page<CheckItem> selectByCondition(String queryString);

    void deleteById(Integer id);
}
