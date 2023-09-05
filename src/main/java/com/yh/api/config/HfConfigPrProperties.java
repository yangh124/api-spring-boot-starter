package com.yh.api.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author : yh
 * @date : 2021/10/31 14:30
 */

@Getter
@Setter
@ConfigurationProperties(prefix = "hf-weather")
public class HfConfigPrProperties  {

    private String key;

    private String baseUrl;

    /**
     * 查询城市code
     */
    private String cityUrl;


}
