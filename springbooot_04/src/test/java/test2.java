import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * @author sett
 * @date 2021年10月15日 17:06
 * @title
 */
public class test2 {
    @Test
    public void demo(){
        //初始化配置信息
        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(test.class);
        logger.fatal("fatal");//最高级别
    /*
         * @date 2021/10/15 17:09
         * @describe      fatal error warn info debug trace
         */
    }
    @Test
    public void demo2(){
        //获取log对象
        BasicConfigurator.configure();
        Log log = LogFactory.getLog(test2.class);
        log.info("hello jul");
    }
}
