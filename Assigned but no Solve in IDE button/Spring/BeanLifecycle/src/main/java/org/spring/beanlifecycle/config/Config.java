package org.spring.beanlifecycle.config;

import org.spring.beanlifecycle.service.TechBiblioteka;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public TechBiblioteka biblioteka() {
        return new TechBiblioteka();
    }
}
