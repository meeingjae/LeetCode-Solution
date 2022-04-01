package com.romantointeger;

import com.romantointeger.solution.LomanToInteger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        LomanToInteger.romanToInteger("III");
        LomanToInteger.romanToInteger("LVIII");
        LomanToInteger.romanToInteger("MCMXCIV");

        SpringApplication.run(Application.class, args);
    }

}
