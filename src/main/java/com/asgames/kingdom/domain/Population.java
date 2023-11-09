package com.asgames.kingdom.domain;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import static java.lang.Math.round;

@Slf4j
class Population {

    private static final float BIRTH = 0.05F;
    private static final float DEATH = 0.04F;

    @Getter
    private int people = 100;

    void growPopulation() {
        int growth = round(people * (BIRTH - DEATH));
        log.info("Your population has grown by " + growth + " people.");
        people += growth;
    }

    int feedPopulation(int food) {
        if (food < people) {
            int death = people - food;
            log.info(death + " people starved to death.");
            people = food;
        }
        return people;
    }

    @Override
    public String toString() {
        return "Population{" +
                "people=" + people +
                '}';
    }
}
