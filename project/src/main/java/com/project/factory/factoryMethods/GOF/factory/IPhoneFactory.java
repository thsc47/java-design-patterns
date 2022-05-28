package com.project.factory.factoryMethods.GOF.apple.factory;

import com.project.factory.factoryMethods.GOF.apple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(){
        
        IPhone device = null;

        device = createIphone();

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }
    protected abstract IPhone createIphone();
}
