package com.qiuqi.mark.service.DesignPatterns.DecoratorPattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/17/20 11:36 AM
 */
public class CpuModule extends MachineModule {

    @Override
    int computePercent() {
        return 11;
    }
}
