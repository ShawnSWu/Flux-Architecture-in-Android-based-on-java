package com.shawn.pushproject.FluxCenter.store;

import com.shawn.pushproject.FluxCenter.Dispatcher.Dispatcher;
import com.shawn.pushproject.FluxCenter.action.FluxAction;
import com.shawn.pushproject.FluxCenter.view.BaseActivity;
import com.shawn.pushproject.FluxCenter.view.onFluxChangedListener;

import java.util.LinkedList;

/**
 * Created by Shawn Wu on 2017/11/10.
 */

public abstract class Store implements viewReigister {


    private LinkedList<onFluxChangedListener> list  = new LinkedList<>();

     public Store(){
         Dispatcher.getDispatcher().register(this);
     }

    public abstract void onFluxActionHandling(FluxAction fluxAction);


    public void emitted(FluxAction fluxAction) {
        for(onFluxChangedListener o: list) {
            o.onFluxChanged(fluxAction);
        }
    }

    @Override
    public void register(BaseActivity activity) {
        list.add(activity);
    }

    @Override
    public void unRegister(BaseActivity activity) {
        Dispatcher.getDispatcher().unRegister(this);
        list.remove(activity);
    }


}
