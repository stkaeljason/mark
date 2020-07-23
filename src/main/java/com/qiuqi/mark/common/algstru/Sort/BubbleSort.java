package com.qiuqi.mark.common.algstru.Sort;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/9/20 11:14 AM
 */
public class BubbleSort extends AbstractSort implements Sort{

    public BubbleSort(int[] a){
        super(a);
    }

    @Override
    public int[] sort() {
        boolean flag = true;
        for (int i=1;i <=len-1;i++){
            for(int j=0;j<len-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }else {
                flag = true;
            }
            showCollection();
        }
        return arr;
    }
}
