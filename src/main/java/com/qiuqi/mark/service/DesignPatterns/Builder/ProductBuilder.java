package com.qiuqi.mark.service.DesignPatterns.Builder;

import com.qiuqi.mark.service.DesignPatterns.AbstractFactory.Product;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/12/20 3:36 PM
 */
public abstract class ProductBuilder {

    public void buildNode(){}

    public abstract Product build();
}
