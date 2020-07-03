package com.qiuqi.mark.service.DesignPatterns.TemplatePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/18/20 3:46 PM
 */
public class UbuntuMonitor extends MachineMonitor {

    @Override
    int computeCpu() {
        return 0;
    }

    @Override
    int computeMem() {
        return 0;
    }

    @Override
    int computeGpu() {
        return 0;
    }

    @Override
    boolean isComputerGpu() {
        return true;
    }
}
