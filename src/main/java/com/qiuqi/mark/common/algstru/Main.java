package com.qiuqi.mark.common.algstru;

import com.qiuqi.mark.common.algstru.Sort.*;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/2/20 5:52 PM
 */
public class Main {

    public static void main(String[] args){
        int[] a = new int[]{3,1,0,-1,9,8,2,7,10,100,-2,8,9,22};
        HeapSort sort = new HeapSort(a);
        sort.sort();
        sort.showCollection();
    }
}
