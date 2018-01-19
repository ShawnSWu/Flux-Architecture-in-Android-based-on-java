package com.shawn.pushproject;
import android.util.Log;

import com.shawn.pushproject.FluxCenter.action.FluxAction;
import com.shawn.pushproject.FluxCenter.store.AppFluxCenterType;
import com.shawn.pushproject.FluxCenter.store.Store;

/**
 * Created by Administrator on 2017/11/10.
 */

public class MainStore extends Store {

    @Override
    public void onFluxActionHandling(FluxAction fluxAction) {
        Log.e("MainStore",fluxAction.getType());
        switch (fluxAction.getType()){

            case MainActionType.MAIN:

                emitted(fluxAction);
                break;

            case MainActionType.TRYY:

                emitted(fluxAction);
                break;

        }

    }

}
