import java.util.*;
class HashNode
{
	Integer key;
	String value;
	HashNode next;
	
	HashNode(Integer key,String value)
	{
		this.key = key;
		this.value = value;
	}
}

public class HashMap
{
	private HashNode[] Bucket;
	
	private int  no_Of_Bucket;
	private int size;
	
	public HashMap(int capacity)
	{
		this.no_Of_Bucket = capacity;
		Bucket = new HashNode[capacity];
	}
	
	public HashMap(){
		this(10);
	}
	
	public int size(){
		return size;
	}
	public boolean isEmpty(){
	  
	       return size == 0;
	}
	      
	public int getIndex(int key)
	{
		return key % Bucket.length;
	}
	        
	public void put(Integer key,String value)
	{
	    int BucketIndex = 0;
	    if(key == null){
	    	BucketIndex = 0;
	    }else{
	    	BucketIndex = getIndex(key);
	    }
		
		HashNode head = Bucket[BucketIndex];
		
		while(head != null)
		{
			if(head.key.equals(key))
			{
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = Bucket[BucketIndex];
		HashNode newNode = new HashNode(key,value);
		     newNode.next = head;
		     Bucket[BucketIndex] = newNode;
	}
	
	public String get(Integer key)
	{
	      if(key == null)
	    {
	    	throw new IndexOutOfBoundsException("Invalid");
	    }
	    
		int BucketIndex = getIndex(key);
		HashNode head = Bucket[BucketIndex];
		
		while(head != null)
		{
			if(head.key.equals(key))
			{
				return head.value;
			}
			head.next = head;
		}
	     return null;
	}
	
	public String remove(int key)
	{
		if(key == 0)
		{
			throw new IndexOutOfBoundsException("Invalid");
		}
		
		int BucketIndex = getIndex(key);
		HashNode prev = null;
		HashNode head = Bucket[BucketIndex];
		
		while(head != null)
		{
			if(head.key.equals(key))
				break;
		
		     prev = head;
		     head = head.next;
		  }   
		     if(head == null){
		     	return null;
		     }
		     size --;
		     if(prev != null)
		     {
		     	prev.next = head.next;
		     }
		     else
		     	Bucket[BucketIndex] = head.next;
		     	
		    return head.value;
	}
	
	public void display()
	{
		for(HashNode head: Bucket)
		{
		    //  HashNode temp = head;
			while(head != null)
			{
				System.out.println("Key = "+head.key +","+"Value = "+head.value);
				head = head.next;
			}
			
		}
	}
	
	public List keySet(){
		List key = new ArrayList();
		for(HashNode head : Bucket)
		{
			while(head != null)
			{
				key.add(head.key);
				head = head.next;
			}
		}
		return key;
	}
	
	public List values()
	{
		List value = new ArrayList();
		
		for(HashNode head : Bucket)
		{
			while(head != null)
			{
				value.add(head.value);
				head = head.next;
			}
		}
		return value;
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("{");
		for(HashNode head : Bucket)
		{
			while(head != null)
			{
				sb.append(head.key).append("=").append(head.value+" ");
				head = head.next;
			}
			
		}
		sb.append("}");
		return sb.toString();
	}
	
	public void replace(Integer key,String value)
	{
		int BucketIndex = getIndex(key);
		HashNode head = Bucket[BucketIndex];
		
		while(head != null)
		{
			if(head.key.equals(key))
			{
				head.value = value;
				return;
			}
			head = head.next;
		}
	}
	
	public boolean containsKey(int key)
	 	{
	 		int BucketIndex = getIndex(key);
	 		HashNode head = Bucket[BucketIndex];
	 		
	 		while(head != null)
	 		{
	 			if(Objects.equals(head.key,key))
	 			{
	 				return true;
	 			}
	 			head = head.next;
	 		}
	 		return  false;
	 	}
	 	public boolean containsValue(String value)
	 	{
	 		for(HashNode head : Bucket)
	 		{
	 			while(head != null)
	 			{
	 				if(Objects.equals(head.value,value))
	 				{
	 					return true;
	 				}
	 				head = head.next;
	 			}
	 		}
	 		return false;
	 	}
	

}
	

			
		
				                                                                                                                                                                                                                                                                                                                             	   
	
		
