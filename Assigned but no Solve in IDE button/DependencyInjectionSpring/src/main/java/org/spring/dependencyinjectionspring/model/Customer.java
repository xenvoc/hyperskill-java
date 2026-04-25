package org.spring.dependencyinjectionspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private final Product product;

    public Customer(Product product) {
        this.product = product;
    }
}
