package com.qiuqi.mark.common.algstru.Sort;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/21/20 4:12 PM
 */

public class Qsort {
    private int[] array;
    private int len ;
    public Qsort(int[] array) {
        this.array = array;
        len = array.length;
    }
    public void sort() {
        quickSort(array, 0, array.length - 1);
    }
    public void print() {
        StringBuilder arrlist = new StringBuilder();
        for(int i=0;i<len;i++){
            if(arrlist.length() >0){
                arrlist.append(",");
            }
            arrlist.append(array[i]);

        }
        System.out.print(arrlist.toString()+"\n");
    }

    /**
     * 递归排序
     * @param src
     * @param begin
     * @param end
     */
    private void quickSort(int[] src, int begin, int end) {
        if (begin < end) {
            int key = src[begin];
//            int key = src[(begin+end)/2];
            int i = begin;
            int j = end;
            while (i < j) {
                while (i < j && src[j] > key) {
                    j--;
                }
                if (i < j) {
                    src[i] = src[j];
                    i++;
                }
                while (i < j && src[i] < key) {
                    i++;
                }
                if (i < j) {
                    src[j] = src[i];
                    j--;
                }
            }
            src[i] = key;
            quickSort(src, begin, i - 1);
            quickSort(src, i + 1, end);
            print();
        }
    }
}