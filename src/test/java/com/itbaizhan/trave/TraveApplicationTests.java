package com.itbaizhan.trave;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itbaizhan.trave.pojo.Admin;
import com.itbaizhan.trave.server.AdminService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TraveApplicationTests {
@Autowired
private AdminService adminService;
    @Test
    void contextLoads() {
        Page<Admin> page=adminService.findPage(1,5);
        System.out.println(page);
    }

}
