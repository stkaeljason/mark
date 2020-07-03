package com.qiuqi.mark.service.DesignPatterns.Observer;

import java.util.List;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/18/20 6:01 PM
 */
public class OnInstalled implements SubJect {

    private List<Observer> observerList;

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notisfy() {
        for(Observer observer : observerList){
            observer.update();
        }
    }
}
