package models;
import play.db.jpa.Model;
import utils.StationReading;

import javax.persistence.Entity;
@Entity
public class Reading extends Model {
  public String date;

  public int code;
  public double temperature;

  public double windSpeed;

  public double windDirection;

  public int pressure;

  public Reading(String date, int code, double temperature, double windSpeed, double windDirection, int pressure) {
    this.date = date;
    this.code = code;
    this.temperature = temperature;
    this.windSpeed = windSpeed;
    this.windDirection = windDirection;
    this.pressure = pressure;
  }

  public String getWeatherCodes() {
    return StationReading.weatherCodes(code);
  }
  public String getWeatherIcons() {
    return StationReading.weatherIcon(code);
  }

  public double getTempFahrenheit() {
    return StationReading.tempFahrenheit(temperature);
  }

  public double getWindChill() {
    return StationReading.windChill(temperature, windSpeed);
  }

  public int getBeaufort() {
    return StationReading.beaufort(windSpeed);
  }

  public String getBeaufortLabel() {
    return StationReading.beaufortLabel();
  }

  public String getWindCompass() {
    return StationReading.windCompass(windDirection);
  }

  public String getTimeStamp() {
    return StationReading.dateStamp(date);
  }
}


