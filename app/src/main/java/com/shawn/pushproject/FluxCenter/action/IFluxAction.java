package com.shawn.pushproject.FluxCenter.action;

/**
 * Created by Shawn Wu on 2017/11/9.
 */

public interface IFluxAction {


     String getType();

     Object[] getData();
}
