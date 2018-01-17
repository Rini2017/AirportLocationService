package com.cognizant.airport.location.api;


import io.swagger.annotations.ApiParam;

import java.util.Iterator;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestPart;
//import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.cognizant.airport.location.model.AirportCityCode;
import com.cognizant.airport.location.model.InlineResponse200;
import com.cognizant.airport.location.model.InlineResponse200Airport;
import org.springframework.boot.context.web.SpringBootServletInitializer;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.context.annotation.ComponentScan;
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
//@EnableEurekaClient

@SpringBootApplication
//@EnableDiscoveryClient
@RestController
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T12:59:37.339Z")
@Controller
public class AirportApiController extends SpringBootServletInitializer implements AirportApi {


    public ResponseEntity<InlineResponse200> getAirportByLoc(@NotNull @ApiParam(value = "Name Of City/Airport Code Entered By User",
                                                                                required = true, defaultValue = "") @RequestParam(
                                                                                                                                  value = "cityName",
                                                                                                                                  required = true,
                                                                                                                                  defaultValue = "") String cityName) {
        // do some magic!

        //Calling MongoDB api

        final String uri = "https://api.mlab.com/api/1/databases/cloudfoundry/collections/AirportsByCity";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept", "application/json");
        UriComponentsBuilder builder = null;
        boolean searchByArptCode = false;
        if (cityName.length() == 3) {

            //building query for searching by airport code
            builder =
                      UriComponentsBuilder.fromHttpUrl(uri).queryParam("q", "{'AirportCityCode.Airport.AirportCode' : '" + cityName + "'}")
                                          .queryParam("f", "{'_id': 0 }").queryParam("fo", "true")
                                          .queryParam("apiKey", "B5o7ycWHwEailJZhJ9ViYpPTePnCpgZy");
            searchByArptCode = true;

        } else {

            //building query for searching by city name
            builder =
                      UriComponentsBuilder.fromHttpUrl(uri).queryParam("q", "{'AirportCityCode.CityName' : '" + cityName + "'}")
                                          .queryParam("f", "{'_id': 0 }").queryParam("fo", "true")
                                          .queryParam("apiKey", "B5o7ycWHwEailJZhJ9ViYpPTePnCpgZy");
        }
        System.out.println("URI to mlab : " + builder.build().encode().toUri());
        InlineResponse200 response200 = null;
        try {

            response200 = restTemplate.getForObject(builder.build().encode().toUri(), InlineResponse200.class);
            if (response200 != null && response200.getAirportCityCode() != null) {
                //System.out.println("Response " + response200.toString());
                //System.out.println("AiportCityCode " + response200.getAirportCityCode());
                System.out.println("Inside if");
                if (searchByArptCode) {
                    response200.getAirportCityCode().setIsAirportCode("true");
                    List<InlineResponse200Airport> airportList = response200.getAirportCityCode().getAirport();
                    Iterator<InlineResponse200Airport> itr = airportList.iterator();
                    while (itr.hasNext()) {
                        InlineResponse200Airport airport = itr.next();
                        System.out.println("City Name : " + cityName);
                        if (cityName.equalsIgnoreCase(airport.getAirportCode())) {
                            System.out.println("Match found in database for input AirportCode");
                            airportList.clear();
                            airportList.add(airport);
                            response200.getAirportCityCode().setAirport(airportList);
                            break;
                        }
                    }

                } else {
                    response200.getAirportCityCode().setIsAirportCode("false");
                }

                response200.getAirportCityCode().setIsMatchFound("true");
            } else {
                System.out.println("Inside else");
                if (response200 == null) {
                    response200 = new InlineResponse200();
                }
                if (response200.getAirportCityCode() == null) {
                    response200.setAirportCityCode(new AirportCityCode());
                }
                response200.getAirportCityCode().setIsAirportCode("false");
                response200.getAirportCityCode().setIsMatchFound("false");
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }

        return new ResponseEntity<InlineResponse200>(response200, HttpStatus.OK);
    }

}
