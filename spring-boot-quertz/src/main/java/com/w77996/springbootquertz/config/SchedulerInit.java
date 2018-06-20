package com.w77996.springbootquertz.config;

import com.w77996.springbootquertz.scheduler.MyScheduler;
import lombok.extern.slf4j.Slf4j;
import org.quartz.SchedulerException;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SchedulerInit {

    @Scheduled(cron = "0/1 * * * * ?")
    public void cronJob() {
       log.info("[CronJob Execute]");
    }
}
