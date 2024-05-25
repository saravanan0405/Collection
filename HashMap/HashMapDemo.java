class HashMapDemo
{
	public static void main(String s[])
	{
		HashMap obj = new HashMap();
		
		System.out.println(obj.size());
		
		obj.put(12,"North");
		obj.put(24,"East");
		obj.put(98,"south");
		obj.put(56,"west");
		
		System.out.println(obj);
		
		System.out.println(obj.get(56));
		
		System.out.println(obj.remove(98));
		
		System.out.println(obj);

		System.out.println(obj.keySet());
		
		System.out.println(obj.values());
		
		obj.replace(56,"North");
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		System.out.println(obj.isEmpty());
		
		System.out.println(obj.containsKey(98));
		System.out.println(obj.containsValue("East"));
		
		
	}
}
		
		
		
		
