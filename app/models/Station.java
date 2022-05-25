package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
public class Station extends Model {
  public String name;
  public float latitude;
  public float longitude;
  @OneToMany(cascade = CascadeType.ALL)

  public List<Reading> readings = new ArrayList<Reading>();
  private String trendTemp;
  public Station(String name, float latitude, float longitude) {
    this.name = name;
    this.latitude = latitude;
    this.longitude = longitude;
  }
  public Reading getLatestReading() {
    Reading latestReading = null;
    if (readings.size() > 0) {
      latestReading = readings.get(readings.size() - 1);
    }
    return latestReading;
  }
  public Reading getLastTwo() {
    Reading lastTwo = null;
    if (readings.size() >0) {
      lastTwo = readings.get(readings.size() - 2);
    }
    return lastTwo;
  }
  public Reading getLastThree() {
    Reading lastThree = null;
    if (readings.size() >0) {
      lastThree = readings.get(readings.size() -3);
    }
    return lastThree;
  }
  public Reading getMinTemp() {
    Reading minTemp = readings.get(0);
    for (Reading reading : readings) {
      if (reading.temperature < minTemp.temperature) {
        minTemp = reading;
      }
    }
    return minTemp;
  }
  public Reading getMaxTemp() {
    Reading maxTemp = readings.get(0);
    for (Reading reading : readings) {
      if (reading.temperature > maxTemp.temperature) {
        maxTemp = reading;
      }
    }
    return maxTemp;
  }
  public Reading getMinWind() {
    Reading minWind = readings.get(0);
    for (Reading reading : readings) {
      if (reading.windSpeed < minWind.windSpeed) {
        minWind = reading;
      }
    }
    return minWind;
  }
  public Reading getMaxWind() {
    Reading maxWind = readings.get(0);
    for (Reading reading : readings) {
      if (reading.windSpeed > maxWind.windSpeed) {
        maxWind = reading;
      }
    }
    return maxWind;
  }
  public Reading getMinPress() {
    Reading minPress = readings.get(0);
    for (Reading reading : readings) {
      if (reading.pressure < minPress.pressure) {
        minPress = reading;
      }
    }
    return minPress;
  }
  public Reading getMaxPress() {
    Reading maxPress = readings.get(0);
    for (Reading reading : readings) {
      if (reading.pressure > maxPress.pressure) {
        maxPress = reading;
      }
    }
    return maxPress;
  }
  public String getTrendTemp() {
    double A = getLatestReading().temperature;
    double B = getLastTwo().temperature;
    double C = getLastThree().temperature;
    if (A > B && B > C){
      trendTemp = "red arrow alternate circle up icon";
    } else if (A<B && B<C){
      trendTemp = "blue arrow alternate circle down icon";
  }
    return trendTemp;
  }
  public String getTrendWind() {
    double A = getLatestReading().windSpeed;
    double B = getLastTwo().windSpeed;
    double C = getLastThree().windSpeed;
    if (A > B && B > C){
      trendTemp = "red arrow alternate circle up icon";
    } else if (A<B && B<C){
      trendTemp = "blue arrow alternate circle down icon";
    }
    return trendTemp;
  }
  public String getTrendPressure() {
    double A = getLatestReading().pressure;
    double B = getLastTwo().pressure;
    double C = getLastThree().pressure;
    if (A > B && B > C){
      trendTemp = "red arrow alternate circle up icon";
    } else if (A<B && B<C){
      trendTemp = "blue arrow alternate circle down icon";
    }
    return trendTemp;
  }
}

