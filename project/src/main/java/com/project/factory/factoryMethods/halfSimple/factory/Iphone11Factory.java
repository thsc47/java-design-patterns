package com.project.factory.factoryMethods.halfSimple.factory;

import com.project.factory.factoryMethods.halfSimple.model.IPhone;
import com.project.factory.factoryMethods.halfSimple.model.IPhone11;
import com.project.factory.factoryMethods.halfSimple.model.IPhone11Pro;

public class Iphone11Factory extends IphoneFactory {

    @Override
    protected IPhone createIphone(String level) {
        if ("standard".equals(level)) {
            return new IPhone11();
        } else {
            return new IPhone11Pro();
        }
    }
}
