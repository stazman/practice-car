
public class Engine extends CarPart {

	int horsepower = 597;
	
	public void rev() {
		
		System.out.println("it's being run very fast right now!");
		
	}
	
	public void function(){
		
		System.out.print("This car can be run at a horsepower of " + horsepower + " and ");
		
		rev();
		
	}
	
}
