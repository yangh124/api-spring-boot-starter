package com.yh.api.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties({HfConfigPrProperties.class, QywxConfigProperties.class})
public class ApiConfiguration {
}
