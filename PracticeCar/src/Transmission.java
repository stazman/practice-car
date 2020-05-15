
public class Transmission extends CarPart {

	byte numberOfSpeeds;
	
	public void shiftGears() {
		
		System.out.println("is shifting gears madly on a curvy road!");
		
	}
	
	public void function(){
		
		System.out.println("This car is a " + numberOfSpeeds + "-speed " + " and ");
		
		
		shiftGears();
		
	}
	
}
