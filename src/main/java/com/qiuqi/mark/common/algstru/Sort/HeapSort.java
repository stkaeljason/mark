package com.qiuqi.mark.common.algstru.Sort;

import java.util.Arrays;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/31/20 2:19 PM
 */
public class HeapSort extends AbstractSort implements Sort{

    public HeapSort(int []a){
        super(a);
    }

    @Override
    public int[] sort() {
        for(int i=arr.length/2-1;i>=0;i--){
            adjustHeap(i, arr.length);
        }

        for(int j = arr.length-1;j>0;j--){
            swap(0,j);
            adjustHeap(0,j);
        }

        return arr;
    }

    public void adjustHeap(int i,int length){
        int temp = arr[i];
        for(int k=i*2+1;k<length;k=2*k+1){
            if(k+1<length && arr[k] <arr[k+1]){
                k++;
            }
            if(arr[k] >temp){
                arr[i] = arr[k];
                i = k;
            }else {
                break;
            }
        }
        arr[i] = temp;
    }
}
class HeapSortz {
    public static void main(String []args){
        int []arr = {9,8,7,6,5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int []arr){
        //1.构建大顶堆
        for(int i=arr.length/2-1;i>=0;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr,i,arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j=arr.length-1;j>0;j--){
            swap(arr,0,j);//将堆顶元素与末尾元素进行交换
            adjustHeap(arr,0,j);//重新对堆进行调整
        }

    }

    /**
     * 调整大顶堆（仅是调整过程，建立在大顶堆已构建的基础上）
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int []arr,int i,int length){
        int temp = arr[i];//先取出当前元素i
        for(int k=i*2+1;k<length;k=k*2+1){//从i结点的左子结点开始，也就是2i+1处开始
            if(k+1<length && arr[k]<arr[k+1]){//如果左子结点小于右子结点，k指向右子结点
                k++;
            }
            if(arr[k] >temp){//如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = temp;//将temp值放到最终的位置
    }

    /**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}