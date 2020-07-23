package com.qiuqi.mark.common.algstru.Sort;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/20/20 10:29 AM
 */
public class QuickSort extends AbstractSort implements Sort{

    public QuickSort(int[] a){
        super(a);
    }

    @Override
    public int[] sort() {
        quickSort(0,len-1);
        return arr;
    }

    public void quickSort(int left, int right){
        if(left<right){
            //left<right ==>finally,left==right,stack will over;出现交错或者相等时就结束本次递归调用,不然会进入死循环
            int key = arr[left];
            int l = left;
            int r = right;
            while (l < r){
                while (l < r && arr[r]>key){
                    r--;
                    System.out.println("r:"+r);
                }
                if(l<r){
                    arr[l] = arr[r];
                    //当两个相邻的数相等，而且l,r相邻时会进入死循环；此操作会让l,r相向而行，从而跳出left<right判断，结束递归;而且没有相邻时，完成移位后可以减少一次判断
                    l++;
                }

                while (l < r && arr[l]<key){
                    l++;
                    System.out.println("l:"+l);
                }
                if(l<r){
                    arr[r] = arr[l];
                    //当两个相邻的数相等，而且l,r相邻时会进入死循环；此操作会让l,r相向而行，从而跳出left<right判断，结束递归;而且没有相邻时，完成移位后可以减少一次判断
                    r--;
                }
            }

            arr[l] = key;
            System.out.println(l+','+key);
            quickSort(left,l-1);
            quickSort(l+1,right);
            System.out.println(l+","+key+","+r);
            showCollection();
        }
    }
}
