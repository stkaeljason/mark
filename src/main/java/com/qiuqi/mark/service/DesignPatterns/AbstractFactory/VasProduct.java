package com.qiuqi.mark.service.DesignPatterns.AbstractFactory;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/11/20 10:49 AM
 */
public class VasProduct extends Product {

    private VasProduct(){}

    private  static class InterClass{
        private static VasProduct vasProduct = new VasProduct();
    }

    public static VasProduct getInstance(){
        return InterClass.vasProduct;
    }
}
