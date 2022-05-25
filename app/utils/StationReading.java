package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class StationReading {
    public static double tempFahrenheit;
    public static double windChill;
    public static double beaufort;
    private static String windCompass;
    public static String weatherCodes(int code) {
        HashMap<Integer, String> weatherCodes = new HashMap<>();
        weatherCodes.put(100, "Clear");
        weatherCodes.put(200, "Partial Clouds");
        weatherCodes.put(300, "Cloudy");
        weatherCodes.put(400, "Light Showers");
        weatherCodes.put(500, "Heavy Showers");
        weatherCodes.put(600, "Rain");
        weatherCodes.put(700, "Snow");
        weatherCodes.put(800, "Thunder");
        return weatherCodes.get(code);
    }
    public static String weatherIcon(int code) {
        HashMap<Integer, String> weatherIcon = new HashMap<>();
        weatherIcon.put(100, "large orange sun icon");
        weatherIcon.put(200, "large orange cloud sun icon");
        weatherIcon.put(300, "large  grey cloud icon");
        weatherIcon.put(400, "large grey cloud sun rain icon");
        weatherIcon.put(500, "large black cloud showers heavy icon");
        weatherIcon.put(600, "large grey cloud rain icon");
        weatherIcon.put(700, "large orange snowflake icon");
        weatherIcon.put(800, "large violet bolt icon");
        return weatherIcon.get(code);
    }
    public static double tempFahrenheit(double temperature) {
        tempFahrenheit = ((temperature * 9) / 5) + 32;
        return tempFahrenheit;
    }
    public static double windChill(double temperature, double windSpeed) {
        windChill = 13.12 + (0.6215 * temperature) - 11.37 * (Math.pow(windSpeed, 0.16)) + (0.3965 * temperature) * (Math.pow(windSpeed, 0.16));
        return windChill;
    }
    public static int beaufort(double windSpeed) {
        double w = windSpeed;
        if (w < 1) {
            beaufort = 0;
        } else if (w > 1 & w <= 5) {
            beaufort = 1;
        } else if (w > 6 & w <= 11) {
            beaufort = 2;
        } else if (w > 12 & w <= 19) {
            beaufort = 3;
        } else if (w > 20 & w <= 28) {
            beaufort = 4;
        } else if (w > 29 & w <= 38) {
            beaufort = 5;
        } else if (w > 39 & w <= 49) {
            beaufort = 6;
        } else if (w > 50 & w <= 61) {
            beaufort = 7;
        } else if (w > 62 & w <= 74) {
            beaufort = 8;
        } else if (w > 75 & w <= 88) {
            beaufort = 9;
        } else if (w > 89 & w <= 102) {
            beaufort = 10;
        } else if (w > 103 & w <= 117) {
            beaufort = 11;
        } else if (w > 117) {
            beaufort = 11;
        }
        return (int) beaufort;
    }
    public static String beaufortLabel() {
        int bf = (int) beaufort;
        String beaufortLabel = null;
        if (bf == 0) {
            beaufortLabel = "Calm";
        } else if (bf == 1) {
            beaufortLabel = "Light Air";
        } else if (bf == 2) {
            beaufortLabel = "Light Breeze";
        } else if (bf == 3) {
            beaufortLabel = "Gentle Breeze";
        } else if (bf == 4) {
            beaufortLabel = "Moderate Breeze";
        } else if (bf == 5) {
            beaufortLabel = "Fresh Breeze";
        } else if (bf == 6) {
            beaufortLabel = "Strong Breeze";
        } else if (bf == 7) {
            beaufortLabel = "Near Gale";
        } else if (bf == 8) {
            beaufortLabel = "Gale";
        } else if (bf == 9) {
            beaufortLabel = "Severe Gale";
        } else if (bf == 10) {
            beaufortLabel = "Strong Storm";
        } else if (bf >= 11) {
            beaufortLabel = "Violent Storm";
        }
        return beaufortLabel;
    }
    public static String windCompass(double windDirection) {
        double dr = windDirection;
        if (dr >= 11.26 && dr <= 33.75) {
            windCompass = "north northeast";
        } else if (dr >= 33.76 & dr <= 56.25) {
            windCompass = "north east";
        } else if (dr >= 56.26 & dr <= 78.75) {
            windCompass = "east northeast";
        } else if (dr >= 78.76 & dr <= 101.25) {
            windCompass = "east";
        } else if (dr >= 101.26 & dr <= 123.75) {
            windCompass = "east southeast";
        } else if (dr >= 123.76 & dr <= 146.25) {
            windCompass = "south east";
        } else if (dr >= 146.26 & dr <= 168.75) {
            windCompass = "south southeast";
        } else if (dr >= 168.76 & dr <= 191.25) {
            windCompass = "south";
        } else if (dr >= 191.26 & dr <= 213.75) {
            windCompass = "south southwest";
        } else if (dr >= 213.76 & dr <= 236.25) {
            windCompass = "south west";
        } else if (dr >= 236.26 & dr <= 258.75) {
            windCompass = "west southwest";
        } else if (dr >= 258.76 & dr <= 281.25) {
            windCompass = "west";
        } else if (dr >= 281.26 & dr <= 303.75) {
            windCompass = "west northwest";
        } else if (dr >= 303.76 & dr <= 326.25) {
            windCompass = "northwest";
        } else if (dr >= 326.26 & dr <= 348.75) {
            windCompass = "north northwest";
        } else if (dr >= 346.75 & dr <= 360) {
            windCompass = "north";
        } else if (dr >= 0 & dr <= 11.25) {
            windCompass = "north";
        } else if ((dr >= 361)) {
            windCompass = "n/a";
        }
        return windCompass;
    }
    public static String dateStamp(String date) {
        SimpleDateFormat dateNow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timeStamp = dateNow.format(new Date());
        return timeStamp;
    }
}