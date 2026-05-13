package org.spring.dependencyinjectionspring;

import org.spring.dependencyinjectionspring.model.Car;
import org.spring.dependencyinjectionspring.model.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// doubled up with DependencyInjection class, but only an example anyway
public class DiApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);
        Car myBean = context.getBean("tesla", Car.class);
        System.out.println(myBean.getEngine().getBrand());
    }
}
