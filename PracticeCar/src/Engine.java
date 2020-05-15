
public class Engine extends CarPart {

	int horsepower;
	
	public void rev() {
		
		System.out.println("is being revved right now.");
		
	}
	
	public void function(){
		
		System.out.println("This car can be run to a horsepower of " + horsepower + " and ");
		
		
		rev();
		
	}
	
}
