package org.spring.handlingreqwbodies.controller;

import org.spring.handlingreqwbodies.model.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @PostMapping("/user")
    public String userStatus(@RequestBody UserInfo user) {
        if (user.isEnabled()) {
            return String.format("Hello! %s. Your account is enable nao.", user.getName());
        } else {
            return String.format("Hello! Nice to see you, %s! Your acc has been disabled", user.getName());
        }
    }
}
