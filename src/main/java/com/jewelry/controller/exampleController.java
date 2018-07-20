package com.jewelry.controller;

import com.jewelry.common.ResultBody;
import com.jewelry.model.vo.User;
import com.jewelry.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by admin on 2018/7/20.
 */
@Controller
public class exampleController {
    @Resource
    private UserService userService;
    @RequestMapping("/index")
    public String index(){
        return "test";
    }

    @RequestMapping(value = "/list", produces = {"application/json"}, method = RequestMethod.GET)
    public ResultBody getList() {
        List<User> list=userService.getList();
        return new ResultBody(list);
    }
}
