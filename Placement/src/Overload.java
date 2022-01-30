//this is the program about the overloading 
public class Overload {

	void add()//method with no arguments
	{
		System.out.println("This is the add method");
		
	}
	void add(int i,int j)//method with two arguments anything which you know about 
	
	{
	  int add=i+j;
	  System.out.println("Addition is"+add);
	}
	
	
	public static void main(String[] args)
	{
		Overload o = new Overload();
		
		o.add();
		o.add(10,20);
	}

}
