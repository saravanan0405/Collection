class StackUsingLinkedList
{
        private Node top;
	class Node
	{
		Node data;
		int next;
	
	    	Node(int val)
	    	{
	    		data = val;
	    		next = null;
	    	}
	} 	
	StackUsingLinkedList()
	{
		top = null;
	}
	
	public void push(int val)
	{
		Node newNode = new Node(val);
		
		newNode.next = top;
		   top = newNode;
	}
	
	public int pop()
	{
		if(top == null)
		{
			throw new IndexOutOfBoundsException("Stack is null");
		}
		
		int temp = top.data;
		top = top.next;
		return temp;
	}
	
	public int peek()
	{
		if(top == null)
		{
			throw new IndexOutOfBoundsException("Stack is null");
		}
		
		return top.data;
	}
	
	public boolean isEmpty()
	{
		return top == null;
	}
	
	public int search(int val)
	{
		int temp = top;
		int pos =0;
		
		if(temp == null)
		{
			throw new IndexOutOfBoundsException("Stack is empty");
		}
		
		while(temp != null)
		{
			if(temp.data == val)
			{
			    return pos;
			}
		     temp.next = temp;
		  pos++;
		 }
	    return -1;
	}
			
}				
