package com.qiuqi.mark.service.DesignPatterns.Adapter;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/16/20 3:51 PM
 */

public class LiveAdapter implements TestLiveBaseService {
    private TestLive testLive;

    public LiveAdapter(TestLive testLive) {
        testLive = testLive;
    }

    @Override
    public Boolean isSerLive() {
        Boolean src = testLive.isLive(11);
        return src;
    }
}
