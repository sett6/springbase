import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author sett
 * @date 2021年10月15日 16:54
 * @title
 */
public class test {
    @Test
    public void demo1(){
        Logger logger = Logger.getLogger("icu.sett.test");
        logger.info("hello jul");
        logger.log(Level.INFO,"icu.sett");
        // 通过占位符的方式来获取变量的值
        String name ="chenxiao";
        Integer age = 12;
        logger.log(Level.WARNING,"yonghu:{0}{1}",new Object[]{name,age});
    }
}
