/**
  * Created by Vidyashree on 04/24/2018.
  */

package com.webservice_tutorial.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hi Welcome to REST Web Service";
	}
}
