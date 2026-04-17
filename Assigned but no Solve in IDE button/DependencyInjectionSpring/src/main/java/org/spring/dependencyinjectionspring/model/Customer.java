package org.spring.dependencyinjectionspring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
    private Product product;

    @Autowired
    public void setProduct(Product product) {
        this.product = product;
    }
}
