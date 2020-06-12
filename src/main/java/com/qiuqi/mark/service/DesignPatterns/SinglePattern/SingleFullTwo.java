package com.qiuqi.mark.service.DesignPatterns.SinglePattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/8/20 5:14 PM
 */
public enum SingleFullTwo {
    INSTASS;
    public void sayHello(){
        System.out.println("hello");
    }
}

class main{

    public static void main(String [] args){
        SingleFullTwo s1 = SingleFullTwo.INSTASS;
        SingleFullTwo s2 = SingleFullTwo.INSTASS;
        System.out.println(s1 == s2);
    }
}
