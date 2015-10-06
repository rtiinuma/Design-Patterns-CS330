
public class WASlotStore extends MachineStore {

	@Override
	protected SlotMachine createMachine(String type) {
		if( type.equals("straight") ) {
			System.out.println("--- Making a Washington style Straight Slot Machine---");
			return new WAMachineStraight();
		}
		else if( type.equals("bonus") ) {
			System.out.println("--- Making a Washington style Bonus Slot Machine---");
			return new WAMachineBonus();
		}
		else if( type.equals("progressive") ) {
			System.out.println("--- Making a Washington style Progressive Slot Machine---");
			return new WAMachineProgressive();
		}
		else {
			return null;
		}
	}

}
