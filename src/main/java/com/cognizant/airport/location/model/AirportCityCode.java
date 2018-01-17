package com.cognizant.airport.location.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.*;
/**
 * AirportCityCode
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-29T12:59:37.339Z")

public class AirportCityCode   {
  @JsonProperty("Airport")
  private List<InlineResponse200Airport> airport = new ArrayList<InlineResponse200Airport>();

  @JsonProperty("CityName")
  private String cityName = "";

  @JsonProperty("CountryName")
  private String countryName = "";

  //@JsonProperty("isAirportCode")
  private String isAirportCode = null;

  //@JsonProperty("isMatchFound")
  private String isMatchFound = null;

  public AirportCityCode airport(List<InlineResponse200Airport> airport) {
    this.airport = airport;
    return this;
  }

  public AirportCityCode addAirportItem(InlineResponse200Airport airportItem) {
    this.airport.add(airportItem);
    return this;
  }

   /**
   * Get airport
   * @return airport
  **/
  //@ApiModelProperty(value = "")
  public List<InlineResponse200Airport> getAirport() {
    return airport;
  }

  public void setAirport(List<InlineResponse200Airport> airport) {
    this.airport = airport;
  }

  public AirportCityCode cityName(String cityName) {
    this.cityName = cityName;
    return this;
  }

   /**
   * Get cityName
   * @return cityName
  **/
 // @ApiModelProperty(value = "")
  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public AirportCityCode countryName(String countryName) {
    this.countryName = countryName;
    return this;
  }

   /**
   * Get countryName
   * @return countryName
  **/
 // @ApiModelProperty(value = "")
  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(String countryName) {
    this.countryName = countryName;
  }

  public AirportCityCode isAirportCode(String isAirportCode) {
    this.isAirportCode = isAirportCode;
    return this;
  }

   /**
   * Get isAirportCode
   * @return isAirportCode
  **/
 // @ApiModelProperty(value = "")
  public String getIsAirportCode() {
    return isAirportCode;
  }

  public void setIsAirportCode(String isAirportCode) {
    this.isAirportCode = isAirportCode;
  }

  public AirportCityCode isMatchFound(String isMatchFound) {
    this.isMatchFound = isMatchFound;
    return this;
  }

   /**
   * Get isMatchFound
   * @return isMatchFound
  **/
 //@ApiModelProperty(value = "")
  public String getIsMatchFound() {
    return isMatchFound;
  }

  public void setIsMatchFound(String isMatchFound) {
    this.isMatchFound = isMatchFound;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AirportCityCode airportCityCode = (AirportCityCode) o;
    return Objects.equals(this.airport, airportCityCode.airport) &&
        Objects.equals(this.cityName, airportCityCode.cityName) &&
        Objects.equals(this.countryName, airportCityCode.countryName) &&
        Objects.equals(this.isAirportCode, airportCityCode.isAirportCode) &&
        Objects.equals(this.isMatchFound, airportCityCode.isMatchFound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(airport, cityName, countryName, isAirportCode, isMatchFound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AirportCityCode {\n");
    
    sb.append("    airport: ").append(toIndentedString(airport)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    countryName: ").append(toIndentedString(countryName)).append("\n");
    sb.append("    isAirportCode: ").append(toIndentedString(isAirportCode)).append("\n");
    sb.append("    isMatchFound: ").append(toIndentedString(isMatchFound)).append("\n");
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

