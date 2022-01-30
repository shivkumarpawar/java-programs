import java.util.*;
public class Timepass {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList(2);
		l.add("Neha");
		l.add("Shashwati");
          l.add(1,"Aditya");
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}


}
