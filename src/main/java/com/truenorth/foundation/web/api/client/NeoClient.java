package com.truenorth.foundation.web.api.client;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.truenorth.foundation.loader.api.request.SaveDestinationRequest;
import com.truenorth.foundation.loader.api.response.CityData;
import com.truenorth.foundation.loader.api.response.DestinationData;
import com.truenorth.foundation.loader.utils.Constants;

public class NeoClient {

	public static List<DestinationData> findCuratorDestinations()
	{
		RestTemplate restTemplate = new RestTemplate();
		List<DestinationData> response =  Arrays.asList(restTemplate.getForObject(Constants.NEO_SERVICE + "/findCuratorDestinations", DestinationData[].class));
		return response;
	}
	
	public static DestinationData findDestinationByFprId(String fprid)
    {
        RestTemplate restTemplate = new RestTemplate();
        DestinationData response = restTemplate.getForObject(Constants.NEO_SERVICE + "/findDestinationByFprId?fprid=" + fprid, DestinationData.class);
        return response;
    }
	
	public static List<DestinationData> findDestinationsByStatus(String status)
    {
        RestTemplate restTemplate = new RestTemplate();
        List<DestinationData> response = Arrays.asList(restTemplate.getForObject(Constants.NEO_SERVICE + "/findDestinationsByStatus?status_detail=" + status, DestinationData[].class));
        return response;
    }

}
