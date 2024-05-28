import java.util.*;
class DynamicArrayList
{
	int arr[];
	int size;
	int capacity;
	int intialCapacity = 10;
	
	 DynamicArrayList()
	 {
	 	size =0;
	 	capacity = intialCapacity;
	 	arr = new int[intialCapacity];
	 }
	 
	 public void expandArray()
	 {
	 	capacity *= 2;
	 	arr = Arrays.copyOf(arr,capacity);
	 }
	 public void add(int val)
	 {
	 	if(size == capacity)
	 	{
	 		expandArray();
	 	}
	 	
	 	arr[size++] = val;
	 }
	 
	 public void insertAtPosition(int pos,int val)
	   {
	      if(size == capacity)
	      {
		expandArray();
	       }
		
		for(int i =size-1;i>=pos;i--)
		{
			arr[i+1] = arr[i];
		}
		    arr[pos] = val;
		    size++;
	   }

	 public void removeIndex(int pos)
	 {
	 	for(int i = pos+1;i<size;i++)
	 	{
	 		arr[i-1] = arr[i];
	 	}
	 	size--;
	 	
	 	if(capacity > intialCapacity && capacity > 3*size){
	 		shrinkArray();
	 	}
	}
	
	public void shrinkArray()
	{
		capacity = capacity/2;
		arr =Arrays.copyOf(arr,capacity);
	}
	
	public int search(int val)
	{
		int pos =0;
		for(int i=0;i<size;i++)
		{
			if(arr[i] == val)
			{
				return pos;
			}
			pos++;
		}
		return -1;
	}
		
	public String toString()
	{	
		StringBuffer sb = new StringBuffer();
		
		sb.append("[");
		for(int i=0;i<size;i++)
		{
			
			sb.append(this.arr[i]);
			 if(i == size-1)
			 
			 break;
			 else
			 	sb.append(",");
		}
		sb.append("]");
		return sb+"";
	}

	public void deleteAtEnd()
	{
		int pos =size-1;
		
		for(int i =pos;i<=size;i++)
		{
			arr[i-1] = arr[i];
		}
		size--;
	}
	
	public void deleteAtBegining()
	{
		int pos=1;
		for(int i=pos;i<=size;i++)
		{
			arr[i-1] = arr[i];
		}
		
		size--;
	}
	
	public int getIndex(int val)
	{
		int count=0;
		for(int i=0;i<size;i++)
		{
			if(arr[i] == val)
			{
				return count;
			}
			count++;
		}
		return -1;
	}
		
	public void update(int val,int pos)
	{

		for(int i=size-1;i>pos;i--)
		{
			arr[i+1] = arr[i];
		}
		arr[pos] = val;
		
	}
	
	public int size()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
}		
		
