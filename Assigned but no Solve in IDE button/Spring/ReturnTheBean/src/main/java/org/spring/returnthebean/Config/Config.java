package org.spring.returnthebean.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public String bean1() {
        return "String for beanie1";
    }

    @Bean
    public String bean2() {
        return "String for beanie2";
    }

    @Bean
    public int[] bean3() {
        return new int[]{1, 2};
    }
}
