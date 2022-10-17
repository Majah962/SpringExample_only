package hr.kingict.akademija;


import hr.kingict.akademija.bean.FirstBean;
import hr.kingict.akademija.bean.LombokBean;
import hr.kingict.akademija.bean.SpringBean;
import hr.kingict.akademija.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {


       /* FirstBean firstBean = new FirstBean();
        System.out.println(firstBean);*/

        /*LombokBean lombokBean = new LombokBean(1, "" );
        lombokBean.setLombokId(2);
        lombokBean.setLombokName("Ana");*/

//        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        SpringBean springBean = (SpringBean) context.getBean("springBean");

        /*springBean.setId(2);
        springBean.setName("Iva");*/

//        System.out.println(springBean);

        FirstBean firstBean = (FirstBean) context.getBean("firstBean");
        System.out.println(firstBean);

        //provjera bean-ova
       /* for (String name: context.getBeanDefinitionNames()) {
            System.out.println(name);
        }*/

    }
}
