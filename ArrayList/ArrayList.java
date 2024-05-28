import java.util.*;

class ArrayList
{
	public static void main(String s[])
	{
		DynamicArrayList list = new DynamicArrayList();
		
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(10);
		list.add(34);
		list.add(87);
		list.add(33);
		list.add(99);
		list.add(44);
		
		System.out.print(list);
		
		System.out.println(list.size());
		
		System.out.println(list.isEmpty());
		
		list.insertAtPosition(3,123);
		
		System.out.println(list.search(99));
		
		list.deleteAtEnd();
		
		list.deleteAtBegining();
		
		System.out.println(list.getIndex(33));
		
		list.update(234,5);
		
		list.removeIndex(1);
		
		System.out.print(list);
	}
}
