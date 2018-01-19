package com.shawn.pushproject.FluxCenter.action;

import com.shawn.pushproject.MainActionCreator;

/**
 * Created by Shawn.Wu on 2017/11/8.
 */

public class ActionCreatorCenter {


    public MainActionCreator getMainActionCreator(){
        return new MainActionCreator();
    }

}
