package com.qiuqi.mark.service.DesignPatterns.AbstractFactory;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/11/20 10:58 AM
 */
public class SimpleFactory {

    public Product createProduct(String protuctCategory) {
        Product product = null;
        if (protuctCategory.equals("vas")){
            product = VasProduct.getInstance();
        }else if(protuctCategory.equals("vision")){
            product = new VisionProduct();
        }
        return product;
    }
}
