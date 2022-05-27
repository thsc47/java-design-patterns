package com.project.gofFactory.apple.factory;

import com.project.gofFactory.apple.model.IPhone;
import com.project.gofFactory.apple.model.IPhoneX;

public class IphoneXFactory extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhoneX();
    }
    
    
}
