class QueueDemoList
{
	public static void main(String s[])
	{
		Queue list = new Queue();
		list.enQueue(25);
		list.enQueue(30);
		list.enQueue(45);
		list.enQueue(99);
		list.enQueue(100);
		
		list.display();
		
		list.deQueue();
		
		list.display();
		
		System.out.println(list.peek());
		list.display();
		
		System.out.println(list.isEmpty());
		list.display();
	}
}
