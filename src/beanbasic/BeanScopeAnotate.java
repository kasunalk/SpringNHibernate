package beanbasic;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class BeanScopeAnotate {

    private String beanScope;

    public String getBeanScope() {
        return beanScope;
    }

    public void setBeanScope(String beanScope) {
        this.beanScope = beanScope;
    }

    public void printScopeValue() {
        System.out.println("Value in Scope : " + beanScope);
    }
}
