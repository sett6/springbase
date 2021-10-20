import icu.sett.Config;
import icu.sett.entity.Person;
import icu.sett.entity.Student;
import icu.sett.service.Animal;
import icu.sett.service.impl.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import sun.java2d.pipe.SpanIterator;

import java.util.Arrays;

/**
 * @author sett
 * @date 2021年05月30日 14:41
 * @title
 */
public class test {

    @Test
    public void demo(){
        ApplicationContext context = new ClassPathXmlApplicationContext("/ioc.xml");
        JdbcTemplate bean = context.getBean(JdbcTemplate.class);
    }

    @Test
    public void demo2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Object student = context.getBean("Student");
        Object student2 = context.getBean("Student"); // 默认是单例的
        Object chenxiao = context.getBean("chenxiao");
        String[] beanNamesForType = context.getBeanNamesForType(Person.class);
        System.out.println(Arrays.toString(beanNamesForType));
        System.out.println((Student)chenxiao);
        System.out.println(student==student2);
    }
    @Test
    public void demo3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Object studentbeanfactory = context.getBean("studentfactorybean");
        Object studentbeanfactory2 = context.getBean("studentfactorybean");
        System.out.println(studentbeanfactory==studentbeanfactory2);
    }

    @Test
    public void demo4(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Object student = context.getBean("Student");
        System.out.println((Student)student);
    }
}
