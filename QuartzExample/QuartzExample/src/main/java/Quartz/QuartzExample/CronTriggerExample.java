package Quartz.QuartzExample;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.impl.JobDetailImpl;
import org.quartz.impl.StdSchedulerFactory;
import org.quartz.impl.triggers.CronTriggerImpl;

public class CronTriggerExample 
{
    public static void main( String[] args ) throws Exception
    {
    	// Create a job
    	//JobDetail job = new JobDetail();
    	JobDetailImpl job = new JobDetailImpl();
    	job.setName("dummyJobName");
    	job.setJobClass(HelloJob.class); // Assigning Job class to the JobDetails object
    	
    	// Create a trigger and set interval 
    //	CronTrigger trigger = new CronTrigger(); // Creating trigger
    	CronTriggerImpl trigger = new CronTriggerImpl();
    	trigger.setName("dummyTriggerName"); // Optional
    	trigger.setCronExpression("0/20 * * * * ?"); // setting repeat interval to trigger the job
    	
    	// Create scheduler
    	Scheduler scheduler = new StdSchedulerFactory().getScheduler();
    	// Assign Job and trigger to scheduler
    	scheduler.scheduleJob(job, trigger);
    	// Start scheduler
    	scheduler.start();
    }
}
