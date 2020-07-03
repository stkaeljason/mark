package com.qiuqi.mark.service.DesignPatterns.DecoratorPattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/17/20 11:39 AM
 */

public class ModuleAlarm extends Decoratror{

    public ModuleAlarm(MachineModule machineModule) {
        super(machineModule);
    }

    @Override
    int computePercent() {
        return machineModule.computePercent();
    }

    public String alarm() {
        int per = machineModule.computePercent();
        if (per>90){
            return "over per";
        }else {
            return "no problem";
        }
    }
}