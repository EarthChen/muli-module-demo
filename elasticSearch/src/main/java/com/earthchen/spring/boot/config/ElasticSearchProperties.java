package com.earthchen.spring.boot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: EarthChen
 * @date: 2018/04/16
 */
@Component
@ConfigurationProperties(prefix = "elasticsearch")
public class ElasticSearchProperties {

    public String getEsHost() {
        return esHost;
    }

    public void setEsHost(String esHost) {
        this.esHost = esHost;
    }

    public int getEsPort() {
        return esPort;
    }

    public void setEsPort(int esPort) {
        this.esPort = esPort;
    }

    public String getEsClusterName() {
        return esClusterName;
    }

    public void setEsClusterName(String esClusterName) {
        this.esClusterName = esClusterName;
    }

    @Override
    public String toString() {
        return "ElasticSearchProperties{" +
                "esHost='" + esHost + '\'' +
                ", esPort=" + esPort +
                ", esClusterName='" + esClusterName + '\'' +
                '}';
    }

    private String esHost = "127.0.0.1";

    private int esPort = 9300;

    private String esClusterName;
}

