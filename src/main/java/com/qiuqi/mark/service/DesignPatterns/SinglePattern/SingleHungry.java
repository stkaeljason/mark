package com.qiuqi.mark.service.DesignPatterns.SinglePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/8/20 3:53 PM
 */
public class SingleHungry {

    private static SingleHungry singleHungry = new SingleHungry();

    private SingleHungry(){}

    public SingleHungry getSingleHungry() {
        return singleHungry;
    }
}
