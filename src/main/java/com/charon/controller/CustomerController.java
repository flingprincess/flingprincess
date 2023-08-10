package com.charon.controller;


import com.charon.pojo.R;
import com.charon.service.CustomerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    //自动装配
    @Resource
    CustomerService customerService;

    @RequestMapping("/selectList")
    public R selectList(){
        return customerService.selectList();
    }

}
