package com.qiuqi.mark.service.DesignPatterns.statePattern;

import lombok.Getter;
import lombok.Setter;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/1/20 11:40 AM
 */
@Getter
@Setter
public class Context {
    protected State mState;
    private State noHavePackstate;
    private State waitForInstallState;
    private State waitForStartState;
    private State runingState;

    public Context() {
        noHavePackstate = new NoHavePackstate(this);
        waitForInstallState = new WaitForInstallState(this);
        waitForStartState = new WaitForStartState(this);
        runingState = new RuningState(this);
    }

    public void uploadInstallPack(String path) {
        mState.uploadInstallPack(path);
        System.out.println(mState.toString());
//        mState = new WaitForInstallState();
    }

    public void install() {
        mState.install();
//        mState = new WaitForStartState();
        System.out.println(mState.toString());
    }

    public void startProduct() {
        mState.startProduct();
//        mState = new RuningState();
        System.out.println(mState.toString());
    }
}
