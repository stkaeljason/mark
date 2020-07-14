package com.qiuqi.mark.common.algstru.Sort;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/14/20 2:58 PM
 */
public class InsertSort extends AbstractSort implements Sort{

    public InsertSort(int[] a){
        super(a);
    }

    @Override
    public int[] sort() {
        int temp = 0;
        for(int i=0;i<arr.length-1;i++){
            int j = i;
            temp = arr[j+1];
            while (true){
                if(j>=0 && arr[j]>temp){
                    arr[j+1] = arr[j];
                    j--;
                }else {
                    arr[j+1] = temp;
                    break;
                }
            }
        }
        return arr;
    }
}
