package com.charon;

import com.charon.mapper.CustomerMapper;
import com.charon.pojo.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }
    @Resource
    CustomerMapper customerMapper;
    @Test
    void test01(){
        List<Customer> customers = customerMapper.selectList(null);
        System.out.println(customers);
    }
}
