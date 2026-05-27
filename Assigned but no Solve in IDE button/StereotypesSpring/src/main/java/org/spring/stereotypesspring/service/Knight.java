package org.spring.stereotypesspring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Knight {

    private final Dragon drake;

    @Autowired
    public Knight(Dragon drake) {
        this.drake = drake;
    }

    public void slayDragon() {
        System.out.println(drake.slayDragon());
        System.out.println("The knight kills the drake!");
    }
}
