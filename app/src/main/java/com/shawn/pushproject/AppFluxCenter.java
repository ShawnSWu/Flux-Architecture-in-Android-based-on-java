package com.shawn.pushproject;

import com.shawn.pushproject.FluxCenter.action.ActionCreatorCenter;
import com.shawn.pushproject.FluxCenter.store.FluxStoreCenter;

/**
 * Created by Administrator on 2017/11/8.
 */

public class AppFluxCenter {

    private static ActionCreatorCenter actionCreatorCenter = new ActionCreatorCenter();

    private static FluxStoreCenter fluxStoreCenter = new FluxStoreCenter();


    public static ActionCreatorCenter getActionCreator() {
        return actionCreatorCenter;
    }

    public static FluxStoreCenter getStore() {
        return fluxStoreCenter;
    }

}
