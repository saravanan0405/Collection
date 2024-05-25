class Queue
{
        Node front;
        Node rear;    
	class Node
	{ 
	      int data;
              Node next; 
	
		Node(int val)
		{
			data = val;
			next = null;
		}
	}
	Queue()
	{
		front = null;
		rear = null;
	}
	
	public void enQueue(int val)
	{
		Node newNode = new Node(val);
		if(front == null){
			front = newNode;
			rear = newNode;
		}
		else{
			rear.next = newNode;
			rear = newNode;
		}
	}
		
	public int deQueue()
	{
		if(front == null)
		{
			throw new IndexOutOfBoundsException("Invalid");
		}
		
		int temp = front.data;
	        front = front.next;
	        if(front == null)
	        	rear = null;
	          return temp;
	  }
	  
	  public int peek()
	  {
	  	if(front == null)
	  	{
	  		throw new IndexOutOfBoundsException("Invalid");
	  	}
	  	
	  	return front.data;
	  }
	  
	  public boolean isEmpty()
	  {
	  	return front == null;
	  }
	  
	  public void display()
	  {
	      Node temp =front;
	      while(temp != null)
	      {
	      	System.out.print(temp.data+" ");
	        temp = temp.next;
	      }
	     System.out.println();
	  }	
}
	  
