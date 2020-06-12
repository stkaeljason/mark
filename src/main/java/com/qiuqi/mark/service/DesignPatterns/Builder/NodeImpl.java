package com.qiuqi.mark.service.DesignPatterns.Builder;

import java.util.List;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/12/20 5:15 PM
 */
public class NodeImpl implements Node{

    private List<Module> moduleList;

    @Override
    public void addModule(Module module) {
        moduleList.add(module);
    }

    @Override
    public void delModule() {

    }
}
