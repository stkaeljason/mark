package com.qiuqi.mark.service.DesignPatterns.statePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/1/20 11:32 AM
 */
public interface State {
    void setContext(Context context);
    void uploadInstallPack(String path);
    void install();
    void startProduct();
    void restartProduct();
    void backProdtct();
    void stopProdect();
}
