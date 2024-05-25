class HashSetDemo
{
	public static void main(String s[])
	{
		HashSet obj = new HashSet();
		obj.add(45);
		obj.add(17);
		obj.add(99);
		obj.add(31);
		obj.add(56);
		obj.add(10);
		obj.add(5);
		obj.add(8);
		obj.add(31);
		obj.add(33);
		
		System.out.println(obj);
		
		System.out.println(obj.remove(99));
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		obj.add(58);
		obj.add(29);
		obj.add(48);
		
		System.out.println(obj.remove(33));
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		HashSet h1 =obj.clone();

		System.out.println(h1);
		
			obj.add(h1);
		
		System.out.println(obj);
		
	}
}
		
		
		
		
