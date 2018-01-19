package com.shawn.pushproject.FluxCenter.store;

import com.shawn.pushproject.MainActionType;
import com.shawn.pushproject.MainStore;

/**
 * Created by Shawn Wu on 2017/11/11.
 */

public class FluxStoreCenter {


    private  <T extends Store> T getStore(String type) {

        Store store = STORE_POOL(type);


        if (store == null) {

            switch (type){

                case MainActionType.MAIN:
                    store = new MainStore();
                    break;







            }

        }
            return (T)store;
    }


    public MainStore getMain() {
        return getStore(FluxStoreType.MAIN_STORE);
    }






    public Store STORE_POOL(String type) {
        Store store = null;

        switch (type){

            case FluxStoreType.MAIN_STORE:
                store = new MainStore();
                break;
        }


        return store;
    }

}
