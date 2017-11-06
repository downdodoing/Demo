package com.example.mvp.demo.presenter;

import com.example.mvp.demo.model.IModel.IUserLoginModel;
import com.example.mvp.demo.model.UserLoginModel;
import com.example.mvp.demo.presenter.IPresenter.IUserLoginPresenter;
import com.example.mvp.demo.view.IView.IUserLogin;

/**
 * Created by MVP on 2017/11/6.
 */

public class UserLoginPresenter implements IUserLoginPresenter {

    private IUserLoginModel mUserLoginModel;
    private IUserLogin mUserLogin;

    public UserLoginPresenter(IUserLogin mUserLogin) {
        this.mUserLoginModel = new UserLoginModel();
        this.mUserLogin = mUserLogin;
    }

    @Override
    public void login(String userName, String password) {
        mUserLoginModel.login(userName, password);
    }
}
