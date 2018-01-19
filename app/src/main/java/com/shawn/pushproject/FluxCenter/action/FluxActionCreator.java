package com.shawn.pushproject.FluxCenter.action;

import com.shawn.pushproject.FluxCenter.Dispatcher.Dispatcher;

/**
 * Created by Shawn Wu on 2017/11/9.
 */

public abstract class FluxActionCreator {

    protected FluxAction newAction(final String type, final Object... data) {
        return new FluxAction(type,data);
    }

    protected void addAction(FluxAction newAction){
        Dispatcher.getDispatcher().send(newAction);
    }
}
