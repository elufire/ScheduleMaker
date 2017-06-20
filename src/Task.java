// ***************************************************************
//   Task.java										Java Foundations
//
//   Represents a task to be run by the CPU in a computer.
//   
// ***************************************************************
public class Task 
{	
    private String userName;
	private String name;
	private int timeNeeded;
	private int priority;
	private int timeIn;

	
	//-----------------------------------------------------------------
	//  Constructor: Sets up this task using the specified
	//  information
	//-----------------------------------------------------------------
	public Task(String uName, String cname, int tNeeded, int prior)
	{
     userName = uName;
     name = cname;
     timeNeeded = tNeeded;
     priority = prior;

	}
   
   public String getUserName()
   {
      return userName;
   }

	
	/**
	 * Setter for name.
	 * @param newName new value for name
	 */
	public void setName(String newName) 
	{
	    name = newName;
	}

	/**
	 * Getter for name.
	 * @return name
	 */
	public String getName() 
	{
	      return name;
	}
	
	/**
	 * Setter for priority.
	 * @param newPriority new value for priority
	 */
	public void setPriority(int newPriority) 
	{
	    priority = newPriority;
	}

	/**
	 * Getter for priority.
	 * @return priority
	 */
	public int getPriority() 
	{
	    return priority;
	}
	
	/**
	 * Setter for timeIn.
	 * @param newTimeIn new value for timeIn
	 */
	public void setTimeIn(int newTimeIn) 
	{
	      timeIn = newTimeIn;
	}

	/**
	 * Getter for timeIn.
	 * @return timeIn
	 */
	public int getTimeIn() 
	{
	    return timeIn;
	}
	
	/**
	 * Setter for timeNeeded.
	 * @param newTimeNeeded new value for timeNeeded
	 */
	public void setTimeNeeded(int newTimeNeeded) 
	{
	      timeNeeded = newTimeNeeded;
	}

	/**
	 * Getter for timeNeeded.
	 * @return timeNeeded
	 */
	public int getTimeNeeded() 
	{
	     return timeNeeded;
	}
}