package com.qiuqi.mark.service.DesignPatterns.SinglePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/8/20 3:57 PM
 */
public class SingleFullOne {

    private SingleFullOne() {

    }

    private static class CreateInstass {
        public static final SingleFullOne  singleFullOne = new SingleFullOne();
    }

    private SingleFullOne getSingleFullOne() {
        return CreateInstass.singleFullOne;
    }
}
