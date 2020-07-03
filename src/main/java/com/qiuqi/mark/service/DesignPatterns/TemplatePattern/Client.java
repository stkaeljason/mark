package com.qiuqi.mark.service.DesignPatterns.TemplatePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/18/20 3:50 PM
 */
public class Client {

    public void main(String []args) {
        MachineMonitor machineMonito = new UbuntuMonitor();
        machineMonito.getList();
    }
}
