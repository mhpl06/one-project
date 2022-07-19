package com.itbaizhan.trave.server;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itbaizhan.trave.mapper.AdminMapper;
import com.itbaizhan.trave.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

 private AdminMapper adminMapper;

        // 分页查询管理员
         public Page<Admin> findPage(int page, int size){
Page selectPage = adminMapper.selectPage(new Page(page, size), null);
 return selectPage;
 }
}
