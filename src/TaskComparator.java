import java.util.*;

public class TaskComparator<T extends Task> implements Comparator<T>
{
   public int compare (T v1, T v2)
   {     
       
	   if (v1.getPriority() > v2.getPriority()) 
    	   return 1;
       else if (v1.getPriority() < v2.getPriority()) 
    	    return -1;
       else 
    	   return 0;
   }
   
   public boolean equals(Object o)
   {
      return false;
   }
}