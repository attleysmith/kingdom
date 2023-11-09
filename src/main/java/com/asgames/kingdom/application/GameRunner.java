package com.asgames.kingdom.application;

import com.asgames.kingdom.domain.Area;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {

    public void run() {
        Area myArea = new Area();
        playArea(myArea);
    }

    private void playArea(Area area) {
        System.out.println(area);
        System.out.println("-------------");
        for (int i = 1; i <= 2000; i++) {
            area.harvest();
            System.out.println("Year: " + i);
            System.out.println(area);
            System.out.println("-------------");
        }
    }
}
