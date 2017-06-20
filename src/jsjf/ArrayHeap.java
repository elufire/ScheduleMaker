package jsjf;

import java.util.*;

import jsjf.exceptions.*;

/**
 * ArrayHeap provides an array implementation of a heap priority queue heap.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class ArrayHeap<T> extends ArrayBinaryTree<T> 
                                        implements HeapADT<T> 
{
	private Comparator<T> priorityChecker;
    /**
     * Creates an empty heap.
     */
    public ArrayHeap(Comparator<T> cmpObj) 
    {
        super();
        priorityChecker = cmpObj;
    }
    
    /**
     * Adds the specified element to this heap in the appropriate
     * position according to its key value.  
     *
     * @param obj the element to be added to the heap
     */
    public void addElement(T obj) 
    {
        if (count == tree.length)
            expandCapacity();

        tree[count] = obj;
        count++;
	    modCount++;

        if (count > 1)
            heapifyAdd();
    }

    /**
     * Reorders this heap to maintain the ordering property after
     * adding a node.
     */
    private void heapifyAdd()
    {
        T temp;
        int next = count - 1;
        
        temp = tree[next];
        
        while ((next != 0) && 
			priorityChecker.compare(temp, tree[(next-1)/2]) > 0)
        {

            tree[next] = tree[(next-1)/2];
            next = (next-1)/2;
        }

        tree[next] = temp;
    }
    
    /**
     * Remove the element with the highest priority in this heap and
     * returns a reference to it. Throws an EmptyCollectionException if
     * the heap is empty.
     *
     * @return a reference to the element with the highest priority value in this heap
     * @throws EmptyCollectionException if the heap is empty
     */
    public T removeTop() throws EmptyCollectionException 
    {
        if (isEmpty())
            throw new EmptyCollectionException("ArrayHeap");

        T topElement = tree[0];
        tree[0] = tree[count-1];
        heapifyRemove();
        count--;
		modCount--;
        
        return topElement;
    }
    
    /**
     * Reorders this heap to maintain the ordering property
	 * after the top element has been removed.
     */
    private void heapifyRemove()
    {
        T temp;
        int node = 0;
        int left = 1;
        int right = 2;
        int next;
        
        if ((tree[left] == null) && (tree[right] == null))
            next = count;
        else if (tree[right] == null)
            next = left;
        else if (priorityChecker.compare(tree[left],tree[right]) > 0)
            next = left;
        else
            next = right;
        temp = tree[node];

        while ((next < count) && 
			priorityChecker.compare(tree[next], temp) > 0)
        {
            tree[node] = tree[next];
            node = next;
            left = 2 * node + 1;
            right = 2 * (node + 1);
            if ((tree[left] == null) && (tree[right] == null))
                next = count;
            else if (tree[right] == null)
                next = left;
            else if (priorityChecker.compare(tree[left], tree[right]) > 0)
                next = left;
            else
                next = right;
        }
        tree[node] = temp;
    }
    
    /**
     * Returns the element with the highest priority value in this heap.
     * Throws an EmptyCollectionException if the heap is empty.
     *
     * @return the element with the highest priority value in this heap
     * @throws EmptyCollectionException if the heap is empty
     */
    public T findTop() throws EmptyCollectionException
    {
        if (isEmpty())
            throw new EmptyCollectionException("ArrayHeap");
        
        return tree[0];
    }
}


