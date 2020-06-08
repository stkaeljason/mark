package com.qiuqi.mark.service.DesignPatterns.statePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/1/20 11:39 AM
 */
abstract class AbstractState implements State{
    protected Context mContext;

    public void setContext(Context context) {
        mContext = context;
    }

    @Override
    public void uploadInstallPack(String path) {
        throw new RuntimeException("Can't execute this action");
    }

    @Override
    public void install() {
        throw new RuntimeException("Can't execute this action");
    }

    @Override
    public void startProduct() {
        throw new RuntimeException("Can't execute this action");
    }

    @Override
    public void restartProduct() {
        throw new RuntimeException("Can't execute this action");
    }

    @Override
    public void backProdtct() {
        throw new RuntimeException("Can't execute this action");
    }

    @Override
    public void stopProdect() {
        throw new RuntimeException("Can't execute this action");
    }
}
