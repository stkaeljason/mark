package com.qiuqi.mark.service.DesignPatterns.Builder;

import com.qiuqi.mark.service.DesignPatterns.AbstractFactory.Module;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/12/20 5:12 PM
 */
public interface Node {

    void addModule(Module module);

    void delModule();
}
