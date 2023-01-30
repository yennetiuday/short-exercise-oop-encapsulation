package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private String location;
    private double temperature;

    public WeatherReporter(String location, double temperature) {
        this.location = location;
        this.temperature = temperature;
    }

    private static final Integer UPPER_LIMIT = 30;
    private static final Integer LOWER_LIMIT = 10;
    private static final Double TEMP1 = 9.0;
    private static final Double TEMP2 = 5.0;
    private static final Integer TEMP3 = 32;
    private static final String LONDON = "London";
    private static final String CALIFORNIA = "California";
    private static final String CAPE_TOWN = "Cape Town";

    public String print() {

        double newTemp = (TEMP1 / TEMP2) * temperature + TEMP3;
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.", location, check1(), check2(), newTemp);

    }

    public String check1() {
        if (location == LONDON) {

            return "🌦";

        } else if (location == CALIFORNIA) {

            return "🌅";

        } else if (location == CAPE_TOWN) {

            return "🌤";

        }
        return "🔆";
    }

    public String check2() {
        if (temperature > UPPER_LIMIT) {

            return "It's too hot 🥵!";

        } else if (temperature < LOWER_LIMIT) {

            return "It's too cold 🥶!";

        }
        return "Ahhh...it's just right 😊!";
    }

}
