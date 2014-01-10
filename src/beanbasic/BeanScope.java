package beanbasic;

public class BeanScope {

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
