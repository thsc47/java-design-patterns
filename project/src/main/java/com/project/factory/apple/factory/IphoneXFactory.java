package com.project.factory.apple.factory;

import com.project.factory.apple.model.IPhone;
import com.project.factory.apple.model.IPhoneX;

public class IphoneXFactory extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhoneX();
    }
    
    
}
