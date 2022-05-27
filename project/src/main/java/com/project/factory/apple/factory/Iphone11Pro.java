package com.project.factory.apple.factory;

import com.project.factory.apple.model.IPhone;
import com.project.factory.apple.model.IPhone11Pro;

public class Iphone11Pro extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhone11Pro();
    }
    
}
