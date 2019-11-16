package com.itheima.controller;

import com.itheima.constant.MessageConstant;
import com.itheima.entity.Result;
import com.itheima.pojo.CheckItem;
import com.ithema.service.CheckItemService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
*  检查项管理
* */
@RestController
 @RequestMapping("/checkitem")
public class CheckItemController {
    @Reference  //查询服务
    private CheckItemService checkItemService;

    //新增检查项
    @RequestMapping("/add")
    public Result add(@RequestBody  CheckItem checkItem){
        try {
            checkItemService.add(checkItem);
        }catch (Exception e){
            e.printStackTrace();
            //服务调用失败
            return new Result(false, MessageConstant.ADD_CHECKGROUP_FAIL);
        }
        return  new Result(true, MessageConstant.ADD_CHECKGROUP_SUCCESS);
    }
}
