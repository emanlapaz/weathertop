# weathertop

Eugenio Manlapaz 

Hello Welcome to my first web app project.
This is our combined Web development and Programming assignment for SETU HdipCS

This web app is fully deployed via heroku. 
URL: http://blooming-spire-13579.herokuapp.com/

I also uploaded a video in youtube.
URL: https://youtu.be/ioQgd9a8s5E

The weather top app requires a log in to function.

You can sign up by pressing the signup button which brings you to the sign up page.

This is the preset log in details:
    user email: homer@simpson.com
    password: secret
    
There are two preloaded stations on the app which has been uploaded to the elephantSQL.
There are two stations which has their own set of readings.

You can add or delete stations on the main dashboard.
The main dashboard displays the current condtion per station.
When adding a Station, you can also input the location (latitude ang Longitude).

Clicking the blue folder icon will open up the Readings page.
Clicking the red bin icon will delete the stations and its readings.

In the Readings Page, the dashboard will present the latest readings available.

   The first card is the Station name and the location.
   This displays the Latitude and Longitude which has been added during the adding of the station

   The second card is the weather condition. The icon changes depending on the weather code entered.
 
   The third card is the Temperature which displays the Celcius anf Fahrenhet readings.    The minimum and maximum temperature in celcius is also displayed.
 
   The fourth card is the Wind.
   This shows the wind based on the Beaufort scale and Label.
   There is also a compass reading for the wind direction and a min/max value for the wind speed in km/hr.
   The wind chill is also displayed.
 
   The last card is the Pressure which shows the pressure reading in hpa as well as the min/max pressure.
 
   Please note that the trend icon for the Temperature, Wind and Pressure cards will only be displayed if there are >=3 readings.
   Red arrow icon for the uptrend and blue down icon for the downtrend.
 
The reading page also lists the readings entered. It is presented on a table with a Date/Time, Code(weather),
wind speed, wind direction and Pressure.

You can add readings.
The Date/time form is filled up with the current date/time. You can edit this if needed.
  
When adding a Reading the current time and date will be prefilled on the Date/time form.
If it is a newly added Station, you have to manually input the date and time after which the next readings will have a set date/time.

The weather code takes in the numbers 100-800.
The weather codes are as follows:
            100, "Clear"
            200, "Partial Clouds"
            300, "Cloudy"
            400, "Light Showers"
            500, "Heavy Showers"
            600, "Rain"
            700, "Snow"
            800, "Thunder"
 Please note that entering any code aside from the above numbers will return a blank icon.
 
 The Temprature will take in a celcius value and display it in both Celcius and Fahrenheit.
 
 The Wind Speed take in a km/hr value and converts it to the Beaufort scale and label.
 
 The Wind direction takes in a degrees reading from 0-360 and converts then to compass direction.
 
 The Pressure will accept a hpa reading.
 
 You can delete a reading by pressing the red bin icon.


This is a partially completed Release 3 version. I have completed all the required items except for the following:
   a. Release 3- user can edit their personal details.-->I had made a form based on the sign up but I was not able to develop a working code to make it work.
   b. Member dashboard list summary in alpabetical order --> I ran out of time.
 

 


  
