
public class CarPart implements Functional {

	public void status() {
		
		
		int condition = 100;
		
		
		if (condition != 0 && condition - 1 <= 1) {
			
			int wearAndTear = condition - 1;
			
			System.out.println("The condition of this part is " + wearAndTear + ".");
			
		}
			 
		else {
			
			System.out.println("Unfortunately, this car is just a really big paperweight now!");
			
		}
		
	}
	
}
