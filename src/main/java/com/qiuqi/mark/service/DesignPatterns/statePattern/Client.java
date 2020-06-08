package com.qiuqi.mark.service.DesignPatterns.statePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/4/20 5:41 PM
 */
public class Client {
    public static void main(String [] args) {
        Context context = new Context();
        context.setMState(new NoHavePackstate(context));
        context.uploadInstallPack("sldflsf");
        context.install();
        context.startProduct();
        context.restartProduct();

    }
}
