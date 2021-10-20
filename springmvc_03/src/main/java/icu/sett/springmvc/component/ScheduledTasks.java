package icu.sett.springmvc.component;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author sett
 * @date 2021年06月19日 11:47
 * @title
 */
@Component
public class ScheduledTasks {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Scheduled(fixedRate = 5000)
    public void printCurrentTime(){
        System.out.println("现在时间"+sdf.format(new Date()));
    }
}
