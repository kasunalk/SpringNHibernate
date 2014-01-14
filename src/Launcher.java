import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import autocomponent.serice.MicroControllerService;
import autocomponent.serice.MicroControllerWithoutAnnotationService;
import beanbasic.BeanScope;
import beanbasic.QuadCopter;
import simpleExample.HelloWorld;
import simpleExample.OutputHelper;

public class Launcher {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        helloWorld.printHello();

        OutputHelper outputHelper = (OutputHelper) context.getBean("outputHelper");
        outputHelper.output();

//        ApplicationContext annotatedContext = new AnnotationConfigApplicationContext(AppConfig.class);
//        OutputHelper annotateHelper = (OutputHelper) annotatedContext.getBean("outputHelperAnnotate");
//        annotateHelper.output();

        //inject values using p schema
        QuadCopter quadCopter = (QuadCopter) context.getBean("quadCopter");
        quadCopter.printSpec();

        //bean scope - singleton & prototype
        BeanScope beanScopeSingleton = (BeanScope) context.getBean("beanScopeSingleton");
        beanScopeSingleton.setBeanScope("Singleton will create a only one instance every requested");
        beanScopeSingleton.printScopeValue();
        BeanScope beanScopeSingletonNxt = (BeanScope) context.getBean("beanScopeSingleton");
        beanScopeSingletonNxt.printScopeValue();

        BeanScope beanScopePrototype = (BeanScope) context.getBean("beanScopePrototype");
        beanScopePrototype.setBeanScope("Prototype will create a new instance each time requested");
        beanScopePrototype.printScopeValue();
        BeanScope beanScopePrototypeNxt = (BeanScope) context.getBean("beanScopePrototype");
        beanScopePrototypeNxt.printScopeValue();

        //spring el
        springel.QuadCopter quadCopterEL = (springel.QuadCopter) context.getBean("quadCopter2");
        System.out.println(quadCopterEL);

        //Auto component scanning
        MicroControllerService msservice = (MicroControllerService) context.getBean("microControllerService");
        System.out.println(msservice);

        MicroControllerWithoutAnnotationService msserviceWOAnno = (MicroControllerWithoutAnnotationService)
                context.getBean("microControllerWithoutAnnotationService");
        System.out.println(msserviceWOAnno);

        //Auto Wiring

        //AOP
    }
}
