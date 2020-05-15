import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;


public class Car {
	
	public Car(){
		
	}
	
	public void run() {
		 
		Transmission t = new Transmission();
		Engine e = new Engine();
		
		Set<Object> partSet = new HashSet<Object>();
		
		partSet.add(t);
		partSet.add(e);
		
		Iterator<Object> itr = partSet.iterator();
		
		while (((Iterator<Object>) itr).hasNext()) {
			
			e.function();
			
			System.out.println();
			
			t.function();
			
			break;
			
	    }
		 
	 }

}
