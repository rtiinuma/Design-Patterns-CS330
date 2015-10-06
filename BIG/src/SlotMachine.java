
public abstract class SlotMachine {
	String cabinet;
	String payment;
	String display;
	String GPU;
	String OS;
	
	void displayComponents(){
		System.out.println("fetching components: " + cabinet + " Cabinet , " + payment + " validator, " + display + ", " + GPU);
	}
	void assemble(){
		System.out.println( "assembling components" );
	}
	void testHardware(){
		System.out.println( "testing hardware" );
	}
	void uploadSoftware(){
		System.out.println( "uploading software: " + OS );
	}
	void testSoftware(){
		System.out.println( "testing software" );
	}
	void deliver( String wrapping, String deliveryMethod ){
		System.out.println( "wrapping slot machine in " + wrapping + " and " + deliveryMethod );
	}
}
