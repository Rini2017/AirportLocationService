package com.cognizant.airport.location.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * InlineResponse200Airport
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T12:59:37.339Z")

public class InlineResponse200Airport   {
  @JsonProperty("AirportCode")
  private String airportCode = null;

  @JsonProperty("AirportName")
  private String airportName = null;

  public InlineResponse200Airport airportCode(String airportCode) {
    this.airportCode = airportCode;
    return this;
  }

   /**
   * Get airportCode
   * @return airportCode
  **/
 // @ApiModelProperty(value = "")
  public String getAirportCode() {
    return airportCode;
  }

  public void setAirportCode(String airportCode) {
    this.airportCode = airportCode;
  }

  public InlineResponse200Airport airportName(String airportName) {
    this.airportName = airportName;
    return this;
  }

   /**
   * Get airportName
   * @return airportName
  **/
  //@ApiModelProperty(value = "")
  public String getAirportName() {
    return airportName;
  }

  public void setAirportName(String airportName) {
    this.airportName = airportName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Airport inlineResponse200Airport = (InlineResponse200Airport) o;
    return Objects.equals(this.airportCode, inlineResponse200Airport.airportCode) &&
        Objects.equals(this.airportName, inlineResponse200Airport.airportName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airportCode, airportName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Airport {\n");
    
    sb.append("    airportCode: ").append(toIndentedString(airportCode)).append("\n");
    sb.append("    airportName: ").append(toIndentedString(airportName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

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

