package com.w77996.springbootquertz.controller;

import com.w77996.springbootquertz.scheduler.MyScheduler;
import org.quartz.SchedulerException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ScheduleController {
    @RequestMapping("/modify")
    public @ResponseBody
    String modify() throws SchedulerException {
        MyScheduler.modifyJob1("0/1 * * * * ?");
        return "1";
    }

    @RequestMapping("/status")
    public @ResponseBody
    String status() throws SchedulerException {
        return MyScheduler.getJob1Status();
    }

    @RequestMapping("/pause")
    public @ResponseBody
    String pause() throws SchedulerException {
        MyScheduler.pauseJob1();
        return "1";
    }

    @RequestMapping("/resume")
    public @ResponseBody
    String resume() throws SchedulerException {
        MyScheduler.resumeJob1();
        return "1";
    }

}
