package com.yjtm.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    DiscoveryClient discoveryClient;
    
    @RequestMapping("/hello")
    public String hello() {
        ServiceInstance instance = discoveryClient.getLocalServiceInstance();
        //打印服务的服务id
        logger.info("*********" + instance.getServiceId());
        return "hello,this is hello-service";
    }
    @RequestMapping("/test")
    public String test() {
    	return "hello,test!";
    }
    
    @RequestMapping("/getUserInfo")
	public Map<String, String> getUserInfo(){
		Map<String , String > map=new HashMap<String,String>();
		map.put("name", "yang");
		map.put("age", "28");
		return map;
		
	}
}
