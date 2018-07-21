package com.suncafly.postprocessor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * ${TODO}
 *
 * @author LiFang
 * @create 2018-07-12 9:20 AM
 */
@SpringBootApplication
public class Application {


//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config.class);
//        annotationConfigApplicationContext.scan("com.suncafly.postprocessor");
//        Cat cat = (Cat) annotationConfigApplicationContext.getBean("cat");
//        CatPostProcessor catPostProcessor = (CatPostProcessor) annotationConfigApplicationContext.getBean("catPostProcessor");
//        cat.show();
//        System.out.println("@@@@" + catPostProcessor);
//        annotationConfigApplicationContext.close();
//    }


    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =  SpringApplication.run(Application.class, args);
        System.out.println(ctx.getBean(Dog.class));
        System.out.println(ctx.getBeanDefinitionCount());
        BeanFactory beanFactory = ctx.getParentBeanFactory();
        System.out.println(beanFactory);
        System.out.println(beanFactory);
//        autowireCapableBeanFactory = ctx.getAutowireCapableBeanFactory();
//        Object object =  autowireCapableBeanFactory.getBean("&beanFactory");
//        System.out.println(object);
    }
}
