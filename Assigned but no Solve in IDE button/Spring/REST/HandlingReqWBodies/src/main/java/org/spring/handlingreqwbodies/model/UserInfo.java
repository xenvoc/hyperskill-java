package org.spring.handlingreqwbodies.model;

public class UserInfo {
    private int id;
    private String name;
    private String phone;
    private boolean enable;

    UserInfo() {}

    public boolean isEnabled() {
        return enable;
    }

    public String getName() {
        return name;
    }
}
