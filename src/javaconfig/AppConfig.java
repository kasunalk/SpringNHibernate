package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import beanbasic.BeanScope;
import simpleExample.OutputHelper;

@Configuration
public class AppConfig {

    @Bean(name = "outputHelperAnnotate")
    public OutputHelper getOutputHelper() {
        return new OutputHelper();
    }

    @Bean(name = "beanScopePrototypeAnnotate")
    public BeanScope getBeanScope() {
        return new BeanScope();
    }
}
