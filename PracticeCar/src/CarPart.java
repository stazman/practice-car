
public class CarPart implements Functional {

	public void status() {
		
		int condition = 100;
		
		if (condition > 0) {
			
			condition--; 
			
			System.out.println("The condition of this part is " + condition + ".");
			
		} else {
			
			System.out.println("This condition of this part is completely unusable.");
			
		}
			
	}
	
}
