public class LinkedList 
{
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
	private Node head;
	
		LinkedList()
		{
			head = null;
		}

	public void insertAtBegining(int val)
	{
		Node newNode = new Node(val);
		if(head == null)
		{
			head = newNode;
		}
		
		else
		{
			newNode.next = head;
			head = newNode;
		}
	}
	
	public void add(int val)
	{
		Node newNode = new Node(val);
		if(head == null)
		{	
			head = newNode;
		}
		else{
			Node temp = head;
			while(temp.next  != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}  
	}
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	
	public void insertAtPos(int pos,int val)
	{
	    Node newNode = new Node(val);
	    Node temp = head;
		if(pos == 0)
		{
			insertAtBegining(val);
			return;
		}
		else
		{
	   	for(int i =1;i<pos;i++)
	   	{
	   		if(temp == null)
	   		{
	   			throw new IndexOutOfBoundsException("Invalid position");
	   		}
		        temp = temp.next;
		 }
		 newNode.next = temp.next;
		 temp.next = newNode;
               }
              }
                            
          public void deletePos(int pos)
          {
            Node temp = head;
            Node prev = null;
            if(pos == 0)
            {	
            	head = head.next;
            }
            else
            {
            	for(int i =1;i<=pos;i++)
            	{
            		if(temp == null)
            		{
            			throw new IndexOutOfBoundsException("Invalid position");
            	        }
            	         prev = temp;
            	         temp = temp.next;
            	}
            prev.next = temp.next;
           }
           display();
           }
           
           public int search(int val)
           {
           	Node temp = head;
           	int pos = 0;
           	
           	while(temp != null)
           	{
           		if(temp.data == val)
           		{
           			return pos;
           		}
           		temp =temp.next;
           		pos++;
           	}
           	
           	return -1;
           	
           }
           
           public void updateValue(int pos,int val)
           {
           	if(pos<0)
           	{
           		throw new IndexOutOfBoundsException("Invalid position");
           	}	
                
                Node temp =head;
                
                for(int i =0;i<=pos;i++)
                {
                	if(temp == null)
                	 {
                	      try{
                	 	throw new Exception("Invalid");
                	       }
                	       catch(Exception e)
                	       {
                	       	System.out.println("Invalid");
                	       }
                	}
                	 else{
                	 	if(i == pos)
                	 	{
                	 		temp.data = val;
                	 	}
                	 }
                	 
                	 temp = temp.next;
               }
             }
             public void deleteAtEnd()
             {
             	if(head == null)
             	{
             	            try{
                	 	throw new Exception("Invalid");
                	       }
                	    catch(Exception e)
                	       {
                	       	System.out.println("Invalid");
                	       }
                }
                
                Node temp = head;
                Node prev = null;
                
                while(temp.next != null)
                {
                	prev = temp;
                	temp = temp.next;
                }
                if(prev == null)
                {
                 head = null;
                 }
                 
                 else
                  prev.next = null;
               }
               
     }
       
