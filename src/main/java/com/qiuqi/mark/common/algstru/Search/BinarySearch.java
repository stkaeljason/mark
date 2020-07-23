package com.qiuqi.mark.common.algstru.Search;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/23/20 2:57 PM
 */
public class BinarySearch {

    public static void main(String[] args){
//        int[] array = {3,0,8,20,5,10};
//        search(array,0,array.length-1,3);
        int[] array2 = {1,2,3,5};
        int result = searchForSort(array2,0,array2.length-1,15);
        if(result == -1){
            System.out.print("NOT FOUND");
        }else {
            System.out.printf("find this value index:%d->%d%n",result,array2[result]);
        }

    }

    public static void search(int[] array, int left, int right, int value){
        int mid = (left+right)/2;
       if(left>right){
           return;
       }else if(left==right && array[mid] != value){
           return;
       }
        if(array[mid] == value){
            System.out.println(mid);
            return;
        }
        search(array, left,mid,value);
        search(array,mid+1, right,value);

    }

    public static int searchForSort(int[] array, int left, int right, int value){
        //必须是有序序列
        int mid = (left+right)/2;
        if(left>right){
            return -1;
        }
        if(array[mid] == value){
            return mid;
        }
        if(value<array[mid]){
            return searchForSort(array, left,mid,value);
        }else {
            return searchForSort(array,mid+1, right,value);
        }

    }
}
