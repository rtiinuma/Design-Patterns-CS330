
public class NVSlotStore extends MachineStore {

	@Override
	protected SlotMachine createMachine(String type) {
		if( type.equals("straight") ) {
			System.out.println("--- Making a Nevada style Straight Slot Machine---");
			return new NevadaMachineStraight();
		}
		else if( type.equals("bonus") ) {
			System.out.println("--- Making a Nevada style Bonus Slot Machine---");
			return new NevadaMachineBonus();
		}
		else if( type.equals("progressive") ) {
			System.out.println("--- Making a Nevada style Progressive Slot Machine---");
			return new NevadaMachineProgressive();
		}
		else {
			return null;
		}
	}

}
