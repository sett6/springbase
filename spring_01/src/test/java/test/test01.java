package test;

import icu.sett.bean.Person;
import icu.sett.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author sett
 * @date 2021年05月29日 14:41
 * @title
 */
public class test01 {
    @Test
    public void test1() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("/ioc.xml");
        UserService bean = ioc.getBean(UserService.class);
        bean.save();

    }
}
