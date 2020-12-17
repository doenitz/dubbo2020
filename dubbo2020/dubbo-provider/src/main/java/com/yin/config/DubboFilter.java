package com.yin.config;

import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yc
 * @Description:
 * @Date: Create in 20:08 2020/12/16
 */
@Configuration
public class DubboFilter {
    @Bean
    public ProviderConfig providerConfig(){
        ProviderConfig providerConfig=new ProviderConfig();
        providerConfig.setMonitor(new MonitorConfig());
        providerConfig.setToken("123456");
        return providerConfig;
    }
}
