package com.truenorthcorporation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoFundationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFundationApplication.class, args);
	}
}


@RestController
class GreetingController {
	
	@RequestMapping("/")
	public String index() {
		return "index2";
    }
    
    @RequestMapping("/hello/{name}")
    String hello1(@PathVariable String name) {
        return "";
    }

    
	
}

