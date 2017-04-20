package com.truenorthcorporation;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.truenorth.foundation.loader.api.response.DestinationData;
import com.truenorth.foundation.web.api.client.NeoClient;


@SpringBootApplication
public class DemoFundationApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFundationApplication.class, args);
	}
}


@RestController
class UiController {

  
    @RequestMapping("/hello/{name}")
    String hello1(@PathVariable String name) {
        return name;
    }

    @RequestMapping("/test")
    public GreetingData testGreeting(@RequestParam(value = "name",required=true) String name, 
    		@RequestParam(value = "greeting",required=true) String greeting) {
    	GreetingData greet = new GreetingData();
    	greet.setName(name);
    	greet.setGreeting(greeting);
        return greet;
    }

    @RequestMapping("/findCuratorDestinations")
    public List<DestinationData>  findCuratorDestinations() {
        return NeoClient.findCuratorDestinations();
    }
    
    

	
}

