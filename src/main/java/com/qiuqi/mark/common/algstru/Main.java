package com.qiuqi.mark.common.algstru;

import com.qiuqi.mark.common.algstru.Sort.*;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/2/20 5:52 PM
 */
public class Main {

    public static void main(String[] args){
        int[] a = new int[]{3,1,0,8, -1,9};
        InsertSort sort = new InsertSort(a);
        sort.sort();
        sort.showCollection();
    }
}
