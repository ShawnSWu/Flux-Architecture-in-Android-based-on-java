package com.shawn.pushproject.FluxCenter.store;


import com.shawn.pushproject.FluxCenter.view.BaseActivity;

/**
 * Created by Shawn Wu on 2017/11/11.
 */

public interface viewReigister {

    void register(BaseActivity activity);

    void unRegister(BaseActivity activity);


}
