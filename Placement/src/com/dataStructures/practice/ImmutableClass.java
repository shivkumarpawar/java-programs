package com.practice;
public final class ImmutableClass
   {
    private final int age;
    private final String name;
    public ImmutableClass(int age, String name)
    {
        this.name = name;
        this.age = age;
    }
    public int getAge() 
    {
        return age;
    }
    public String getName()
    {
        return name;
    }


	public static void main(String[] args)
	{
		ImmutableClass i=new ImmutableClass(22,"Shiv");
		int s=i.getAge();
		String str=i.getName();
		System.out.println(s +" " +str);
		

	}

}
