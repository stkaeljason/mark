package com.qiuqi.mark.common.algstru.Sort;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/22/20 2:50 PM
 */
public class MergeSort extends AbstractSort implements Sort {

    public MergeSort(int[] a){
        super(a);
    }

    @Override
    public int[] sort() {
        divide(0,arr.length-1);
        return arr;
    }

    public void divide(int left, int right){
        if(left == right){
            return;
        }
        int mid = (left+right)/2;
        divide(left,mid);
        divide(mid+1, right);
        merge(left, right, mid+1);


    }

    public void merge(int left, int right, int mid){
        int[] leftArray = new int[mid-left];
        int[] rightArray = new int[right-mid+1];
        for (int i=left;i<mid; i++){
            leftArray[i-left] = arr[i];
        }
        for(int j=mid;j<=right;j++){
            rightArray[j-mid] = arr[j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i<leftArray.length && j<rightArray.length){
            if(leftArray[i] <rightArray[j]){
                arr[k]=leftArray[i];
                i++;
                k++;
            }else {
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }

        while (i<leftArray.length){
            arr[k] = leftArray[i];
            i++;
            k++;

        }
        while (j<rightArray.length){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
