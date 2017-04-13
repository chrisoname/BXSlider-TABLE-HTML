package com.truenorthcorporation;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
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

    
    @RequestMapping("/findCuratorDestinations")
    public List<DestinationData>  findCuratorDestinations() {
        return NeoClient.findCuratorDestinations();
    }
    
    

    
	
}

