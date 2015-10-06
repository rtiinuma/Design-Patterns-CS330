
public abstract class MachineStore {
	
	public SlotMachine orderMachine( String type, String client, 
			                 String wrapping, String deliveryMethod  ) {
		SlotMachine machine;
		
		System.out.println( client + " orders a:");
		
		machine = createMachine(type);
		
		machine.displayComponents();
		machine.assemble();
		machine.testHardware();
		machine.uploadSoftware();
		machine.testSoftware();
		machine.deliver(wrapping, deliveryMethod);
		
		return machine;
	}
	
	protected abstract SlotMachine createMachine( String type );

}
