package com.jdw.eureka.feign.consumer.service;

import com.jdw.eureka.feign.consumer.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "service-provider", fallback = HelloServiceFallback.class)
public interface HelloService {

    @RequestMapping("/hello.do")
    String hello();

    @RequestMapping(value = "/hello1.do", method = RequestMethod.GET)
    String hello(@RequestParam("name") String name);

    @RequestMapping(value = "/hello2.do", method = RequestMethod.GET)
    User hello(@RequestHeader("name") String name, @RequestHeader("age") Integer age);

    @RequestMapping(value = "/hello3.do", method = RequestMethod.POST)
    String hello(@RequestBody User user);

}
