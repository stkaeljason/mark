package com.qiuqi.mark.tool;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/23/20 9:44 AM
 */
public class Collection<E> {

    public static void showCollection(int[] arr) {
        StringBuilder arrlist = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arrlist.length() >0){
                arrlist.append(",");
            }
            arrlist.append(arr[i]);

        }
        System.out.print(arrlist.toString()+"\n");
    }
}
