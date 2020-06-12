package com.qiuqi.mark.service.DesignPatterns.AbstractFactory;

import com.qiuqi.mark.service.DesignPatterns.statePattern.State;
/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/11/20 10:34 AM
 */
public abstract class Product {

    protected State mState;
    private String productName;
    private String productVersion;
    private String productseq;

    public void uploadInstallPack(String path) {
        mState.uploadInstallPack(path);
    }

    public void install() {
        mState.install();
    }

    public void startProduct() {
        mState.startProduct();
    }
}
