package com.qiuqi.mark.service.DesignPatterns.strategyPattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/19/20 5:06 PM
 */
public class Client {

    public void main(String []args){
        MachineManage ubuntuM = new UbuntuManage();
        ubuntuM.modifyIP();

        ubuntuM.setModifyIp(new CentosModifyIP());
        ubuntuM.modifyIP();
    }
}
