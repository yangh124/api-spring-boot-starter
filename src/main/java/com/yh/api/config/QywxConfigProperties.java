package com.yh.api.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : yh
 * @date : 2021/10/31 13:09
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "qywx")
public class QywxConfigProperties {

    private String corpid;

    private String pushSecret;

    private String otherSecret;

    private String agentid;

    /**
     * 前端通讯录展示页面url
     */
    private String memberUrl;
}
