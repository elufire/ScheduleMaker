
// ***************************************************************
//   SchedulerDriver.java								Java Foundations
//
//   Driver program to demonstrate a Scheduler
//   
// ***************************************************************
public class SchedulerDriver
{
	public static void main(String[] args) 
	{
		Scheduler scheduler = new Scheduler();
		
		// Create  a task and send (add) to scheduler.
		
				// run each task
				
			Task t1 = new Task(" Jim ", "Take out the trash",200, 1);
			Task t2 = new Task(" Kim ", "Do the Dishes", 300, 2);
			Task t3 = new Task(" Tom ", " Go mo the lawn", 500, 3);

				
			scheduler.add(t1);
			scheduler.add(t2);
			scheduler.add(t3);
			
			scheduler.runTask();
			scheduler.runTask();
			scheduler.runTask();
		
		
	}
}
		