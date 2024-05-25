class LinkedListDemo
{
	public static void main(String s[])
	{
		LinkedList list = new LinkedList();
		
		
		list.insertAtBegining(10);
		list.insertAtBegining(15);
		list.insertAtBegining(22);
		list.insertAtBegining(28);
		
		list.display();
		
		list.insertAtPos(2,55);
		
		System.out.println("\n");
		list.display();
		
		System.out.println("\n");
		list.deletePos(1);
		
		System.out.println("\n");
		System.out.println(list.search(10));
		
		System.out.println("\n");
		list.updateValue(3,45);
		list.display();
		
		list.deleteAtEnd();
		list.display();
		
		list.add(1234);
		list.display();
		
	

		// System.out.println(list);
	}
}
		 
