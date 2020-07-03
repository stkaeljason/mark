package com.qiuqi.mark.service.DesignPatterns.DecoratorPattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/17/20 3:38 PM
 */
public class Client {

    public void main(String []args) {
        MachineModule machineModule = new CpuModule();
        ModuleAlarm moduleAlarm = new ModuleAlarm(machineModule);
        moduleAlarm.alarm();
    }
}
