package com.qiuqi.mark.common.algstru.Sort;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/7/20 5:31 PM
 */
public class SelectSort implements Sort{

    private int [] arr;
    private int len;

    public SelectSort(int[] a){
        arr = a;
        len = a.length;
    }

    @Override
    public int[] sort() {

        for(int i=0;i<len-1;i++){
            int min = arr[i];
            int minIndex = i;
            for(int j=i;j<len;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
        return arr;
    }

    @Override
    public void showCollection() {
        for(int i=0;i<len;i++){
            System.out.print(arr[i]);
        }
    }
}
