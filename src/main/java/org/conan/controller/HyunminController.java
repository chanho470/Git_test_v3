package org.conan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/hyunmin")
@Log4j
public class HyunminController {
	@GetMapping("/hyunmin")
	public void hyunmin() {
		log.info("hyunmin controller 입니다.");	
	}
}
