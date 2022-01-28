package org.conan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/hello")
@Log4j
public class HelloController {

    @GetMapping("/main")
    public void main() {
        log.info("hello main");
    }

    @GetMapping("/world")
    public void member() {
        log.info("hello world");
    }
    
    @GetMapping("/hi")
    public void hi() {
    	log.info("hi");
    }
    
    @GetMapping("/info")
    public void info() {
    	log.info("hello info 충돌 나라");
    	
    	
    	
        log.info("hello info");
    }

}
