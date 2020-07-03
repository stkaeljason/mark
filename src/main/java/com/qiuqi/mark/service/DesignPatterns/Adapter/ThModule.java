package com.qiuqi.mark.service.DesignPatterns.Adapter;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/16/20 3:55 PM
 */
public class ThModule {

    public Boolean test(TestLiveBaseService testLiveBaseService) {
        return testLiveBaseService.isSerLive();
    }
}
