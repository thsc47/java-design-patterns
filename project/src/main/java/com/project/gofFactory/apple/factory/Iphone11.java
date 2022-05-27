package com.project.gofFactory.apple.factory;

import com.project.gofFactory.apple.model.IPhone;
import com.project.gofFactory.apple.model.IPhone11;

public class Iphone11 extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhone11();
    }
    
}
