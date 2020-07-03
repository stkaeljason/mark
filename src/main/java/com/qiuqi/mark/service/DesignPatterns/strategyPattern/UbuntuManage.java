package com.qiuqi.mark.service.DesignPatterns.strategyPattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/19/20 5:05 PM
 */
public class UbuntuManage extends MachineManage {

    public UbuntuManage(){
        modifyIp = new UbuntuModifyIp();
    }

    @Override
    void computeCpu() {

    }
}
