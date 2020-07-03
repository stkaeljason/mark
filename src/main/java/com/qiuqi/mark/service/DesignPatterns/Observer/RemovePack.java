package com.qiuqi.mark.service.DesignPatterns.Observer;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/18/20 6:06 PM
 */
public class RemovePack implements Observer {
    @Override
    public void update() {
        System.out.println("remove packed");
    }
}
