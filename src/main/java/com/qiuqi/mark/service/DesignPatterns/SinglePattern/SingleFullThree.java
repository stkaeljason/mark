package com.qiuqi.mark.service.DesignPatterns.SinglePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/8/20 5:16 PM
 */
public class SingleFullThree {
    private volatile SingleFullThree singleFullThree;

    private SingleFullThree() {

    }

    public SingleFullThree getSingleFullThree() {
        if(singleFullThree == null) {
            synchronized (SingleFullThree.class){
                if(singleFullThree == null){
                    singleFullThree = new SingleFullThree();
                }
            }
        }
        return singleFullThree;
    }
}
