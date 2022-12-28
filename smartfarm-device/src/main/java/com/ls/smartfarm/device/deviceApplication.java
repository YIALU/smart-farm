package com.ls.smartfarm.device;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author ls
 * @create 2022-12-12-16:45
 */
@SpringBootApplication
@EnableDiscoveryClient
public class deviceApplication {
    public static void main(String[] args) {
        SpringApplication.run(deviceApplication.class,args);
    }

}
