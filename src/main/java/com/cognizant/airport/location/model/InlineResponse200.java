package com.cognizant.airport.location.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T12:59:37.339Z")
public class InlineResponse200 {

    public InlineResponse200() {
    }
    
    @JsonProperty("AirportCityCode")
    private AirportCityCode airportCityCode;

    public AirportCityCode getAirportCityCode() {
        return airportCityCode;
    }

    public void setAirportCityCode(AirportCityCode airportCityCode) {
        this.airportCityCode = airportCityCode;
    }
    
    @Override 
    public String toString() 
    { return "AirportCityCode [AirportCityCode=" + airportCityCode + "]"; }


    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
