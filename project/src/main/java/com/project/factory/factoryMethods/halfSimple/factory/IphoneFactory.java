package com.project.factory.factoryMethods.halfSimple.factory;

import com.project.factory.factoryMethods.halfSimple.model.IPhone;

public abstract class IphoneFactory {
    
    public IPhone orderIphone(String Level){
        IPhone device = null;

        device = createIphone(Level);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;
    }

    protected abstract IPhone createIphone(String level);
}
