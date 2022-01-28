package org.conan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/soohyun")
@Log4j
public class soohyunController {
    
	@GetMapping("/soohyun")
    public void main() {
        log.info("hello Soohyun");
    }
}
