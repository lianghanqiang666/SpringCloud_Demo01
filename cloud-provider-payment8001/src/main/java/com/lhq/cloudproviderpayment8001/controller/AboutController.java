package com.lhq.cloudproviderpayment8001.controller;

import com.lhq.cloudapicommons.entity.CommonResult;
import com.lhq.cloudapicommons.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lianghanqiang
 * @CLass AboutController
 * @create 2022/7/23
 */
@RestController
@RequestMapping("/about")
@Slf4j
public class AboutController {
    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/discovery")
    public Object discovery(Long id) {
        List<String> services = discoveryClient.getServices();
        log.info("服务列表：");
        for (String service : services) {
            log.info("**service->"+service);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PROVIDER-PAYMENT");
        for (ServiceInstance instance : instances) {
            log.info("instance:"+instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort() + "\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
