package com.example.mvp.demo.model;

import com.example.mvp.demo.model.IModel.IUserLoginModel;

/**
 * Created by MVP on 2017/11/6.
 */

public class UserLoginModel implements IUserLoginModel {
    @Override
    public void login(String userName, String password) {
        //通过网络后台访问数据库
    }
}
