package com.project.gofFactory.apple.factory;

import com.project.gofFactory.apple.model.IPhone;
import com.project.gofFactory.apple.model.IPhone11Pro;

public class Iphone11Pro extends IPhoneFactory{

    @Override
    protected IPhone createIphone() {
        return new IPhone11Pro();
    }
    
}
