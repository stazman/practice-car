
public class Transmission extends CarPart {
	
	byte numberOfSpeeds = 7;
	
	public void shiftGears() {
		System.out.print("this car can be shifted with precision.");
		
		System.out.println();
	}
		
	public void status(){
		super.status();
	}
	
	public void function(){
		
		System.out.print("The transmission has " + numberOfSpeeds + " speeds; ");
		
		shiftGears();
		
		status();
		
	}
	
}
