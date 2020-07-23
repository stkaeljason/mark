package com.qiuqi.mark.common.algstru.Sort;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/7/20 5:31 PM
 */
public class SelectSort extends AbstractSort implements Sort{

    public SelectSort(int[] a){
        super(a);
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


}
