package com.ithema.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.itheima.pojo.CheckItem;
import com.ithema.service.CheckItemService;
import org.springframework.transaction.annotation.Transactional;

/*
*    检查项服务
* */
@Service
@Transactional
public class CheckItemServiceImpl implements CheckItemService {
    public void add(CheckItem checkItem) {

    }
}
