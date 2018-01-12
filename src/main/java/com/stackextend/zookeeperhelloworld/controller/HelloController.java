package com.stackextend.zookeeperhelloworld.controller;

import com.stackextend.zookeeperhelloworld.config.HelloProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    HelloProperties helloProperties;

    public HelloController(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    @GetMapping("/properties/display")
    public HelloProperties displayProperties() {
        return helloProperties;
    }

}
