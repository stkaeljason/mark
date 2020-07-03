package com.qiuqi.mark.service.DesignPatterns.Observer;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/18/20 6:04 PM
 */
public class ModifyConfig implements Observer {

    @Override
    public void update() {
        System.out.println("modify product config");
    }
}
