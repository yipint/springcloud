package com.example;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/configs")
@RefreshScope
public class ConfigController {

        @Value("${useLocalCache:false}")
        private boolean useLocalCache = false;


        @GetMapping("/get")
        @ResponseBody
        public boolean getUseLocalCache() {
            return useLocalCache;
        }
}
