import jsjf.*;
// ***************************************************************
//   Scheduler.java								Java Foundations
//
//   Represents a very simple job scheduler that uses a 
//   priority queue to run jobs based on highest priority first
// ***************************************************************

public class Scheduler
{
	private ArrayHeap<Task> pq;
	private int clock;
    private TaskComparator<Task> taskCmp;
   
	public Scheduler()
	{
		clock = 0;
		taskCmp = new TaskComparator<Task>();
        pq = new ArrayHeap<Task>(taskCmp);
	}

	// adds a task to the system
	public void add(Task task)
	{
		task.setTimeIn(clock);
		pq.addElement(task);
	}

	public void runTask()
	{
		    // get the top priority task from the heap
			Task currentTask = pq.removeTop();
			
			// log the task name and time needed
			//<TO DO>
			System.out.println("Task: " + currentTask.getName());
			System.out.println("Time needed: " + currentTask.getTimeNeeded() + " seconds.");
			
			// simulate running the task by ticking the clock forward the amount of time needed
			clock += currentTask.getTimeNeeded();
			
			// log the task name and how many seconds it was in the system by
			// subtracting the time it entered the system from the clock time
			
			int runT = clock - currentTask.getTimeIn();
			System.out.println( currentTask.getName() + " was in the sytem for: " + runT + " seconds.");
			
			// log the current clock time.
		
			System.out.println("Current clock time: " + clock + " seconds.");
			System.out.println("Task Finished User name: " + currentTask.getUserName() + " , Task name: " + currentTask.getName() + " , Duration time: " + currentTask.getTimeNeeded() + " , Priority: " + currentTask.getPriority() + " , Completion time: " + clock);
			System.out.println();
	}
}