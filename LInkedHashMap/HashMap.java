import java.util.*;
class HashNode<T>
{
	T key;
	T value;
	HashNode<T> next;
	
	HashNode(T key,T value)
	{
		this.key = key;
		this.value = value;
	}
}

class Node<T>
{
	T data;
	Node<T>next;
	
	Node(T val)
	{
		data = val;
		next = null;
	}
}	

class HashMap<T>
{
		private Node<T>head;
		private HashNode<T> [] Bucket;
		
		int no_Of_Bucket;
		int size;
		
		HashMap(int capacity)
		{
			head = null;
			no_Of_Bucket = capacity;
			Bucket = new HashNode[no_Of_Bucket];
			size = 0;
		}
		
		HashMap(){
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
		
		public void put(T key,T value)
		{
			int BucketIndex = getIndex(key);
			HashNode head = Bucket[BucketIndex];
			
			while(head != null)
			{
				if(Objects.equals(head.key,key))
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
			
		// Linked list 
		
			if(this.head == null)
			{
				this.head = new Node<>(key);
			}
			else
			{
				Node<T> temp = this.head;
				while(temp.next != null)
				{
					temp = temp.next;
				}
				
			temp.next = new Node<>(key);
			}
			
		}
		public Object get(T key)
		{
			int BucketIndex = getIndex(key);
			HashNode head = Bucket[BucketIndex];
			
			while(head != null)
			{
				if(Objects.equals(head.key,key))
				{
					return head.value;
				}
				head = head.next;
			}
			
			return null;
		}
		
		public Object remove(T key)
		{
			int BucketIndex = getIndex(key);
			HashNode head = Bucket[BucketIndex];
			HashNode prev = null;
			while(head != null)
			{
				if(Objects.equals(head.key,key))
				{
					break;
				}
				
				prev = head;
				head = head.next;
			}
			
			if(head == null)
			{
				return null;
			}
			size--;
			if(prev != null)
			{
				prev.next =  head.next;
			}
			else
			{
				Bucket[BucketIndex] = head.next;
			}
	
			//remove  Linked list elements 
			
			Node<T>temp = this.head;
			Node<T>prve = null;
			
			while(temp != null)
			{
				if(temp.data.equals(key))
				{
					if(prve != null)
					{
						prve.next = temp.next;
					}
					else{
						this.head = temp.next;
					}
					break;
				}
				prve = temp;
				temp = temp.next;
			}
			return head.value;
		}
		
		public List keySet()
		{
			List key = new ArrayList();
			Node <T> temp = head;
				while(temp != null)
				{
					key.add(temp.data);
					temp = temp.next;
				}
			
			return key;
		}
		
		public List Value()
		{
			List Value = new ArrayList();
			for(HashNode head : Bucket)
			{
				while(head != null)
				{
					Value.add(head.value);
					head = head.next;
				}
			}
			return Value;
		}
		
		public String toString()
		{
			StringBuffer sb = new StringBuffer();
					
			sb.append("{");
			
			Node<T> temp = head;
			while(temp != null)
			{
				int BucketIndex = getIndex(temp.data);
				HashNode<T> HashNode = Bucket[BucketIndex];
				
				while(HashNode != null)
				{
				
				if(Objects.equals(HashNode.key,temp.data))
				{
					sb.append(HashNode.key).append("=").append(HashNode.value+" ");
					break;
				}
				HashNode = HashNode.next;
				
				}
				temp = temp.next;
			}
			sb.append("}");
			return sb.toString();
		}
		
		public void replace(T key,T value)
		{
			int BucketIndex = getIndex(key);
			HashNode head = Bucket[BucketIndex];
			
			while(head != null)
			{
				if(Objects.equals(head.key,key))
				{
				System.out.println(head.value);
				 head.value = value;
				 	return;
				}
				head = head.next;
			}
			
		}
		
		public int size()
		{
			return size;
		}
		
		public boolean isEmpty()
		{
			return size == 0;
		}
		
	 	public boolean containsKey(T key)
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
	 	public boolean containsValue(T value)
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
	 	
	 	public void clear()
	 	{
	 		size = 0;
	 		Arrays.fill(Bucket,null);
	 	}
	 		
} 
		
		
				
				
		
		
	
