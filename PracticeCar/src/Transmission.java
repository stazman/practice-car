
public class Transmission extends CarPart {
	
	
	byte numberOfSpeeds = 7;
	
	
	public void shiftGears() {
		
		System.out.print("its gears are being shifted madly on a curvy road!");
		
	}
	
	public void status(){
		
		super.status();
		
		int transCond = 100;
		
		System.out.println("This car has a condition of " + transCond + ".");
		
	}
	
	
	public void function(){
		
		System.out.print("This car is a " + numberOfSpeeds + "-speed " + "and ");
		
		shiftGears();
		
		status();
		
	}
	
}
