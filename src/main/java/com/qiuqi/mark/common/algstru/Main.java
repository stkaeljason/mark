package com.qiuqi.mark.common.algstru;

import com.qiuqi.mark.common.algstru.Sort.BubbleSort;
import com.qiuqi.mark.common.algstru.Sort.SelectSort;
import com.qiuqi.mark.common.algstru.Sort.Sort;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/2/20 5:52 PM
 */
public class Main {

    public static void main(String[] args){
        int[] a = new int[]{3,1,0,8};
        Sort sort = new SelectSort(a);
        sort.sort();
        sort.showCollection();
    }
}
