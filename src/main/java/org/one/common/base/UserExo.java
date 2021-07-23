package org.one.common.base;

import org.jeecgframework.poi.excel.annotation.Excel;
import org.jeecgframework.poi.excel.annotation.ExcelTarget;

import java.io.Serializable;

@ExcelTarget("UserExo")
public class UserExo implements Serializable {
    /**
     * 昵称
     */
    @Excel(name = "用户昵称",width = 20)
    private String nickname;
    /**
     * 手机号
     */
    @Excel(name = "用户手机号",width = 20)
    private String mobile;
    /**
     * 启用状态 1-启用  2-禁用
     */
//    @Excel(name = "用户状态[启用为1、禁用为2]",replace={"开启_1","禁用_2"})
//    private Integer state;


    /**
     * 用户角色  1对1 关系  1-启用  2-禁用
     */
    @Excel(name = "用户角色[超级管理员1、授权管理员为2、案场后台为3、置业顾问为4]",width = 100)
    private String roleName;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
