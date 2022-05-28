package com.project.factory.factoryMethods.halfSimple.factory;

import com.project.factory.factoryMethods.halfSimple.model.IPhone;
import com.project.factory.factoryMethods.halfSimple.model.IPhoneX;
import com.project.factory.factoryMethods.halfSimple.model.IPhoneXSMax;

public class IphoneXFactory extends IphoneFactory {

    @Override
    protected IPhone createIphone(String level) {
        if ("standard".equals(level)) {
            return new IPhoneX();
        } else {
            return new IPhoneXSMax();
        }
    }
}
