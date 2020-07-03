package com.qiuqi.mark.common.algstru;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/3/20 4:24 PM
 */
public class ComputeNum {

    ArrayStack<BigDecimal> arrNum;
    ArrayStack<String> arrFlag;
    HashMap<String,Integer> map;
    String string;

    public ComputeNum(String str){
        string = str;
        int length = str.length();
        arrNum = new ArrayStack<>(length);
        arrFlag = new ArrayStack<>(length);
        map.put("*",3);
        map.put("/",3);
        map.put("+",2);
        map.put("-",2);
    }

    public void insertStack(){
        for(Character s:string.toCharArray()){
            if(map.containsKey(s.toString())){
                if(arrFlag.isEmpty()){
                    arrFlag.push(s.toString());
                }else {
                    if(map.get(s.toString()) <= map.get(arrFlag.getTopValue())){
                        BigDecimal one = arrNum.pop();
                        BigDecimal two = arrNum.pop();
                        String flag = arrFlag.pop();
                        BigDecimal result = flagtofunc(two,one,flag);
                        arrNum.push(result);
                        arrFlag.push(s.toString());
                    }else {
                        arrFlag.push(s.toString());
                    }
                }
            }else {
                arrNum.push(new BigDecimal(s));
            }
        }
    }

    public BigDecimal flagtofunc(BigDecimal one, BigDecimal two, String flag){
        BigDecimal result = null;
        if(flag.equals("+")){
            result = two.add(one);
        }else if(flag.equals("-")){
            result = two.subtract(one);
        }
        else if(flag.equals("*")){
            result = two.multiply(one);
        }
        else if(flag.equals("/")){
            result = two.divide(one);
        }
        return result;
    }

    public Object compute(){
        insertStack();
        Object r = null;

        while (!arrFlag.getTop().equals(-1)){
            BigDecimal one = arrNum.pop();
            BigDecimal two = arrNum.pop();
            String s = arrFlag.pop();
            BigDecimal result = flagtofunc(one,two,s);
            r = result;
            arrNum.push(result);
        }
        return r;
    }

}
