package org.spring.stereotypesspring.controller;

import org.spring.stereotypesspring.service.Knight;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class RoarController {

    private final Knight hedgeKnight;

    @Autowired
    public RoarController(Knight hedgeKnight) {
        this.hedgeKnight = hedgeKnight;
    }
}
