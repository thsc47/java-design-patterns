package com.project.factory.apple.factory;

import com.project.factory.apple.model.IPhone;
import com.project.factory.apple.model.IPhone11;

public class Iphone11 extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhone11();
    }
    
}
