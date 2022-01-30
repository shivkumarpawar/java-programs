package com.collection;

public class Abstractmethods extends MyClass{
	
		   /* Must Override this method while extending
		    * MyClas
		    */
		   public void disp2()
		   {
		       System.out.println("overriding abstract method");
		   }
		   public void disp() {
			   System.out.println("Overriding non abstract method of abstracy classs");
		   }
		   
		   public static void main(String args[]){
			   MyClass obj = new Abstractmethods();
		       obj.disp2();
		       obj.disp();
		   }
		}
abstract class MyClass{
	   public void disp(){
	     System.out.println("Concrete method of parent class");
	   }
	   abstract public void disp2();
	}


