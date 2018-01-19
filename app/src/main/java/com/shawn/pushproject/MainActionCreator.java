package com.shawn.pushproject;

import com.shawn.pushproject.FluxCenter.action.FluxActionCreator;
import com.shawn.pushproject.FluxCenter.store.AppFluxCenterType;

/**
 * Created by Administrator on 2017/11/9.
 */

public class MainActionCreator extends FluxActionCreator {


    public void SendMessage() {
        addAction(newAction(MainActionType.MAIN,"66666666"));
    }

    public void tryss() {
        addAction(newAction(MainActionType.TRYY,"77777777"));
    }

}
