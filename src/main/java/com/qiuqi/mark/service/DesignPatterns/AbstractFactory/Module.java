package com.qiuqi.mark.service.DesignPatterns.AbstractFactory;

/**
 * @author jiaqiying
 * @version 1.0
 * @date 6/12/20 5:42 PM
 */
public abstract class Module {

    private String alias;

    private String serverName;

    private String version;

    private Byte listPort;

    private String path;

    public abstract void modifyConfig();

}
