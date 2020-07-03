package com.qiuqi.mark.service.DesignPatterns.DecoratorPattern;

import java.io.InputStream;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/17/20 11:37 AM
 */
public class Decoratror extends MachineModule {

    MachineModule machineModule;
    InputStream inputStream;

    public Decoratror(MachineModule machineModule){
        machineModule = machineModule;
    }

    @Override
    int computePercent() {
        return machineModule.computePercent();
    }
}
