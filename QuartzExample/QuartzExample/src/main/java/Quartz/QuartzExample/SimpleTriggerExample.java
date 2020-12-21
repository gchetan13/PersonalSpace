package Quartz.QuartzExample;

import java.util.Date;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

public class SimpleTriggerExample 
{
    public static void main( String[] args ) throws Exception
    {
       	/*
    	JobDetail job = new JobDetail();
    	job.setName("dummyJobName");
    	job.setJobClass(HelloJob.class);
    	
    	//configure the trigger time
    	SimpleTrigger trigger = new SimpleTrigger();
    	trigger.setName("dummyTriggerName");
    	trigger.setStartTime(new Date(System.currentTimeMillis() + 1000));
    	trigger.setRepeatCount(SimpleTrigger.REPEAT_INDEFINITELY);
    	trigger.setRepeatInterval(10000); // 10 seconds
    	
    	//schedule it
    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	scheduler.scheduleJob(job, trigger);
    	scheduler.start();
    	*/
    	
    	SampleClass class1 = new SampleClass();
    	class1.meth1();
    }
}
