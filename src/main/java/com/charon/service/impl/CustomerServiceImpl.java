package com.charon.service.impl;


import com.baomidou.mybatisplus.core.injector.methods.SelectList;
import com.charon.mapper.CustomerMapper;
import com.charon.pojo.Customer;
import com.charon.pojo.R;
import com.charon.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    //注入CustomerMapper
    @Resource
    CustomerMapper customerMapper;

    @Override
    public R selectList() {
        //查询会员
        System.out.println("Messie");
        List<Customer> customers = customerMapper.selectList(null);
        System.out.println(customers);
        if (customers.size() > 0 ) {
            return R.ok("成功",customers);
        } else {
            return R.error("失败",null);
        }
    }



}
