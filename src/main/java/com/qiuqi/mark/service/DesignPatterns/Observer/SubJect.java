package com.qiuqi.mark.service.DesignPatterns.Observer;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/18/20 5:59 PM
 */
public interface SubJect {

    void register(Observer observer);

    void remove(Observer observer);

    void notisfy();
}
