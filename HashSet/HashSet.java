import java.util.*;

class HashNode<T>
{
	T key;
	HashNode next;
	
	HashNode(T key)
	{
		this.key = key;
		next = null;
	}
	
}

class HashSet<T>
{
	private HashNode Bucket[];
	int no_Of_Bucket;
	int size;
	
	HashSet(int capacity)
	{
		no_Of_Bucket = capacity;
		Bucket = new HashNode[capacity];
		size = 0;
	}
	
	HashSet()
	{
		this(10);
	}
	
	public int getIndex(T key)    
	{
		if(key == null)
		{
			return 0;
		}
		int hashcode = key.hashCode();
		int index = Math.abs(hashcode) % no_Of_Bucket;
		return index;
	}
	public void add(T key)
	{
		int BucketIndex = getIndex(key);
		HashNode head = Bucket [BucketIndex];
		
		while(head != null)
		{
			if(head.key.equals(key)){
				return;
			}	
			head = head.next;
			}
		
		
	   size++;
	   	head = Bucket[BucketIndex];
	   	HashNode newNode = new HashNode(key);
	   	newNode.next = head;
	   	Bucket[BucketIndex] = newNode;
	  }
	  
	 public boolean remove(T key)
	 {
	 	int BucketIndex = getIndex(key);
	 	HashNode head = Bucket[BucketIndex];
	 	
	 	
	 	HashNode prve = null;
	 	
	 	while(head != null)
	 	{
	 		if(head.key.equals(key))
	 		{
	 			break;
	 		}
	 	prve = head;
	 	head = head.next;
	 	}	
	 	if(head == null)
	 	{
	 		return false;
	 	}
	 	size --;
	 	if(prve != null)
	 	{
	 		prve.next = head.next;
	 	}
	 	else{
	 		Bucket[BucketIndex] = head.next;
	 		}
			 		
	 	return true;
	 }
	 
	 public String toString()
	 {
	 	StringBuffer sb = new StringBuffer();
	 	
	 	sb.append("{");
	 	
	 	for(HashNode head : Bucket)
	 	{
	 		while(head != null)
	 		{
	 			sb.append(head.key+" ");
	 		 	head = head.next;
	 		 }
	 	}
	 	sb.append("}");
	 return sb.toString();
	}
	
	public int size()
	{	
		return size;
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public void clear()
	{
		size = 0;
		Arrays.fill(Bucket,null);
	}
	
	public HashSet<T> clone()
	{
		HashSet<T> cloneSet = new HashSet<T>(no_Of_Bucket);
		for(int i =0;i<no_Of_Bucket;i++)
		{
			HashNode<T> head = Bucket[i];
			while(head != null)
			{
				if(head.key != null)
				{
					cloneSet.add(head.key);
				}
				head = head.next;
			}
		}
		return cloneSet;
	}
	
}
	 		

