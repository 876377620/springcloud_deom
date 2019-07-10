package com.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author djy
 * @date 2019-07-05 17:24
 */

@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
       return new RoundRule_Y();
    }
}
