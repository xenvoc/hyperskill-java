package org.spring.dependencyinjectionspring.model;

@Component
public class InkSupply {
    private final String INK_MESSAGE = "This is supply of ink";

    public String getMessage() {
        return INK_MESSAGE;
    }
}
