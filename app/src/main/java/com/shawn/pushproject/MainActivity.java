package com.shawn.pushproject;

import android.os.Bundle;
import android.util.Log;
import com.shawn.pushproject.FluxCenter.action.FluxAction;
import com.shawn.pushproject.FluxCenter.view.AppBaseActivity;
import com.shawn.pushproject.databinding.ActivityMainBinding;

public class MainActivity extends AppBaseActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = getViewbinding(R.layout.activity_main);


        AppFluxCenter
                .getActionCreator()
                .getMainActionCreator()
                .SendMessage();

        AppFluxCenter
                .getActionCreator()
                .getMainActionCreator()
                .tryss();
    }




    @Override
    public void onFluxChanged(FluxAction fluxAction) {
        Log.e("fuckflux",fluxAction.getType()+"  "+fluxAction.getData()[0]);

    }

    @Override
    public void onFluxStoreRegistered() {
        AppFluxCenter.getStore().getMain().register(this);

    }

    @Override
    public void onFluxStoreUnregistered() {
        AppFluxCenter.getStore().getMain().unRegister(this);
    }
}
