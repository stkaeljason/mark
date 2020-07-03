package com.qiuqi.mark.service.DesignPatterns.TemplatePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/17/20 5:12 PM
 */
public abstract class MachineMonitor {

    abstract int computeCpu();

    abstract int computeMem();

    abstract int computeGpu();

    //gouzi method
    boolean isComputerGpu(){
        return false;
    };

    List<Integer> getList(){
        List<Integer> list = new ArrayList<>();
        int a = computeCpu();
        int b = computeMem();

        if (isComputerGpu()){
            int c = computeGpu();
            list.add(c);
        }
        list.add(a);
        list.add(b);

        return list;
    }
}
