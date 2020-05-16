
public class Engine extends CarPart {

	int horsepower = 597;
	
	public void rev() {
		System.out.println("this car can be run very fast!");
	}
	
	public void status(){
		super.status();
	}
	
	public void function(){
		
		System.out.print("The engine can be run at a horsepower of " + horsepower + "; ");
		
		rev();
		
		status();
		
	}
	
}
