package com.chenxing.casoverlayclient.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SSOController {
	@RequestMapping("/ssoLogin")
	public String home() {
		return "hello";
	}
}
