package com.qiuqi.mark.service.DesignPatterns.strategyPattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/19/20 5:01 PM
 */
public abstract class MachineManage {

    protected ModifyIp modifyIp;

    void modifyIP(){
        modifyIp.modifyIp();
    }

    abstract void computeCpu();

    public void setModifyIp(ModifyIp modifyIp) {
        this.modifyIp = modifyIp;
    }
}
