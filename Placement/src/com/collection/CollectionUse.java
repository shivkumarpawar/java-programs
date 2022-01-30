package com.collection;
import java.util.*;

public class CollectionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ArrayList <String > arr = new ArrayList<String>();
		 
		 arr.add("Mona");
		 arr.add("Shiv");
		 
	System.out.println(arr);
		 
	Iterator itr = arr.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	System.out.println("+++++++++++++++++");
	
	
	
	List<Integer > li = new LinkedList<Integer>();
	
	li.add(4);
	li.add(55);
	li.add(4);
	li.add(3);
	
	
	//list iterator
	  //forward
		ListIterator<Integer> litr = li.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
	
		System.out.println("------------");
		//backward
				ListIterator<Integer> blitr = li.listIterator(4);  //li.size()
				while(blitr.hasPrevious())
				{
					System.out.println(blitr.previous());
				}
			
	
	
	System.out.println("++++++++++++++");
	
	
	
	
	Set<Integer> s = new HashSet<Integer>();
	
	s.add(446);
	s.add(65);
	
	
	//Iterator
	Iterator itrr = s.iterator();
	while(itrr.hasNext())
	{
		System.out.println(itrr.next());
	}
	
	System.out.println("++++++++++++++");
	
	//for each loop
	
	for(Integer i : s)
	{
		System.out.println(i);
	}
	
	
	System.out.println("++++++++++++++");
	
	
	//for each method
	
	s.forEach(w ->{
		System.out.println(w);
	});
	
	System.out.println("++++++++++++++");
	
	
	Map<Integer,String> mp = new TreeMap<Integer,String>();
	
	mp.put(5, "Work");
	mp.put(2,"From ");
	mp.put(8, "Home");
	
	for(Map.Entry me : mp.entrySet())
	{
		System.out.println(me.getKey() + " " + me.getValue());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
}
