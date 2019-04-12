package com.jewelry.threaddemo.t11;

import java.util.Date;

/**
 * Created by admin on 2019/3/28.
 */
public class InheritableThreadLocalExt extends InheritableThreadLocal {
    @Override
    protected Object initialValue() {
        return new Date().getTime();
    }

    @Override
    protected Object childValue(Object parentValue) {
        return parentValue+"我是在子线程中加的";
    }
}
