package com.cognizant.airport.location.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import com.cognizant.airport.location.model.InlineResponse200;

import javax.validation.constraints.NotNull;

//import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T12:59:37.339Z")

@Api(value = "getAirportCityCode", description = "The AirportLocation API")
public interface AirportApi {

    @ApiOperation(value = "Get Airport By Location", notes = "", response = InlineResponse200.class, tags={"AirportLocationSearch"})
    @ApiResponses(value = { 
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found"),
        @ApiResponse(code = 405, message = "Invalid input"),
        @ApiResponse(code = 200, message = "successful operation", response = InlineResponse200.class)})
    @RequestMapping(value = "/getAirportCityCode",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> getAirportByLoc( @NotNull @ApiParam(value = "Name Of City/Airport Code Entered By User", required = true, defaultValue = "") @RequestParam(value = "cityName", required = true, defaultValue="") String cityName);

}
