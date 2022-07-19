package com.itbaizhan.trave.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

// 管理员
@Data
public class Admin {
    @TableId//该注解用于将某个成员变量指定为数据表主键
    private Integer aid;
    private String username;
    private String password;
    private String phoneNum;
    private String email;
    private boolean status; // 状态 true可用 false禁用
    @TableField(exist = false) // 不是数据库的字段
    private List<Role> roles; // 角色集合
}
