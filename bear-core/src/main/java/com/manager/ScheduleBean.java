package com.manager;

import com.google.common.util.concurrent.AbstractScheduledService;

import java.util.concurrent.TimeUnit;

/**
 * @author boyue.lby
 * @date 29/09/2016 13:23
 */
public class ScheduleBean extends AbstractScheduledService {

    @Override protected void runOneIteration() throws Exception {
        System.out.println("qqq");
    }

    @Override protected Scheduler scheduler() {
        return Scheduler.newFixedDelaySchedule(5000, 5000, TimeUnit.MILLISECONDS);
    }
}
