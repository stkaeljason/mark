package com.qiuqi.mark.common.algstru.Sort;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/14/20 3:23 PM
 */

public class AbstractSort {
    protected int [] arr;
    protected int len;

    public AbstractSort(int[] a){
        arr = a;
        len = a.length;
    }

    public void showCollection() {
        StringBuilder arrlist = new StringBuilder();
        for(int i=0;i<len;i++){
            if(arrlist.length() >0){
                arrlist.append(",");
            }
            arrlist.append(arr[i]);

        }
        System.out.print(arrlist.toString()+"\n");
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
