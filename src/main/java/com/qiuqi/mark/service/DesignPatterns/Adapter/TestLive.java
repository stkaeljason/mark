package com.qiuqi.mark.service.DesignPatterns.Adapter;

import io.swagger.models.auth.In;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/16/20 3:43 PM
 */
public class TestLive {

    public Boolean isLive(int port) {
        if(port > 0){
            return true;
        }else {
            return false;
        }
    }
}
