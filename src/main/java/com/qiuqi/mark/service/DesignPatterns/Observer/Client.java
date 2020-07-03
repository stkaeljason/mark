package com.qiuqi.mark.service.DesignPatterns.Observer;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/18/20 6:06 PM
 */

public class Client {
    public void main(String [] args) {
        SubJect onInstalled = new OnInstalled();
        Observer modifyConfig = new ModifyConfig();
        Observer removePack = new RemovePack();
        onInstalled.register(modifyConfig);
        onInstalled.register(removePack);
        onInstalled.notisfy();
    }
}
