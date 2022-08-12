import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println("Comparison beans with Singleton scope: " + (beanHW1 == beanHW2));

        Cat beanCat1 =
                (Cat) applicationContext.getBean("cat");
        Cat beanCat2 =
                (Cat) applicationContext.getBean("cat");

        System.out.println("Comparison beans with Prototype scope: " + (beanCat1 == beanCat2));
    }
}