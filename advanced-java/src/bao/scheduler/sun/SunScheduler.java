package bao.scheduler.sun;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class SunScheduler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScheduledThreadPoolExecutor ex = new ScheduledThreadPoolExecutor(4);
		ex.scheduleAtFixedRate(new Job1(), 0, 5, TimeUnit.SECONDS);
		ex.scheduleAtFixedRate(new Job2(), 1, 2, TimeUnit.SECONDS);
	}

}
class Job1 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Job 1");
	}
}
class Job2 implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("Job 2");
	}
}
