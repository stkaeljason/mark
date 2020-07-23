package com.qiuqi.mark.common.algstru.Sort;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 7/15/20 9:40 AM
 */
public class HillSort extends AbstractSort implements Sort {

    private InsertSort insertSort;

    public HillSort(int[] a){
        super(a);
    }

    @Override
    public int[] sort() {
        int foot = (int)len/2;
        int temp;
        while (true){
            System.out.println(foot);
            for(int i = foot;i<len;i++){
                for(int j=i-foot; j>=0;j-=foot){
                    if(arr[j]>arr[j+foot]){
                        temp = arr[j];
                        arr[j] = arr[j+foot];
                        arr[j+foot] = temp;
                    }
                }
                showCollection();
            }
            foot = (int)foot/2;
            if(foot == 0){
                break;
            }
        }
        return arr;
    }

    public static boolean checkName(String name){
        String sts="~,!,@,#,$,%,^,&,*,+,|,},{,\",:,<,>,?,/,;,\',\',[,],\\,=,`,。";
        String[] arrays=sts.split(",");
        boolean flag=false;
        for(int i=0;i<arrays.length;i++){
            flag=name.contains(arrays[i]);
            if(flag){
                break;
            }
        }
        return flag;
    }

}
