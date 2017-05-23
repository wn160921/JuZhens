package com.example.wangning.juzhen.jieti.presenter;

import com.example.wangning.juzhen.jieti.model.Fenshu;
import com.example.wangning.juzhen.jieti.view.IView;

import javax.inject.Inject;

/**
 * Created by wangning on 2017/5/23.
 */

public class MyPresenter implements IPresenter {
    IView iView;
    Fenshu fenshu;
    @Inject
    public MyPresenter(IView iView){
        this.iView=iView;
    }
    @Override
    public void wanchen() {
        iView.onWanchen();
    }
    @Override
    public void clerae() {
        iView.onClear();
    }
}//
