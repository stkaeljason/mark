package com.qiuqi.mark.service.DesignPatterns.Adapter;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/16/20 3:57 PM
 */
public class Client {

    public void main(String [] args) {
        ThModule thModule = new ThModule();
        thModule.test(new LiveAdapter(new TestLive()));
    }
}
