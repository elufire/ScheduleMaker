import java.util.*;

public class MaxHeapComparator<T extends Object & Comparable<? super T>> 
                                                                 implements Comparator<T>
{
   public int compare (T v1, T v2)
   {      
       if (v1.compareTo(v2) < 0) return -1;
       else if (v1.compareTo(v2) > 0) return 1;
       else return 0;
       
   }
   
   public boolean equals(Object o)
   {
      return false;
   }
}