package com.example.mvp.demo.view;

import com.example.mvp.demo.R;
import com.example.mvp.demo.presenter.IPresenter.IUserLoginPresenter;
import com.example.mvp.demo.presenter.UserLoginPresenter;
import com.example.mvp.demo.view.IView.IUserLogin;

/**
 * Created by MVP on 2017/11/6.
 */

public class LoginActivity extends BaseActivity implements IUserLogin {

    private IUserLoginPresenter mUserLoginPresenter;
    private String userName, password;

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_login);
        init();

        mUserLoginPresenter = new UserLoginPresenter(this);
    }

    //用于初始化各个组件
    @Override
    public void init() {

    }

    @Override
    public void login() {
        //首先校验userName和password的合法性
        mUserLoginPresenter.login(userName, password);
    }
}
