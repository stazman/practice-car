import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;


public class Car {
	
	Car(Transmission t, Engine e){
		
		this.t = t;
		this.e = e;
		
	}
	
	Transmission t = new Transmission();
	Engine e = new Engine();
	
	//make static???
	
	public void run() {
		 
		Set partSet = new HashSet();
		
		partSet.add(t);
		partSet.add(e);
		
		Iterator<String> itr = partSet.iterator(); // traversing over HashSet System.out.println("Traversing over Set using Iterator"); while (itr.hasNext()) { System.out.println(itr.next()); }

		while (((Iterator<String>) itr).hasNext()) {
			
			t.function();
			e.function();
			
	    }
		 
	 }

}
