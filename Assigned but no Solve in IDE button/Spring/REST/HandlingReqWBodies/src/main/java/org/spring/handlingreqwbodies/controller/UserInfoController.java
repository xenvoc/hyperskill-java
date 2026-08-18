package org.spring.handlingreqwbodies.controller;

import org.spring.handlingreqwbodies.model.UserInfo;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserInfoController {

    @PostMapping(value = "/user", consumes = MediaType.APPLICATION_XML_VALUE)
    public String userStatus(@RequestBody UserInfo user) {
        return String.format("Added user %s", user);
    }
}
