package com.perscholas.lab.myServices;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneServices {
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}