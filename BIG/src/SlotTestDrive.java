
public class SlotTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MachineStore njStore = new NJSlotStore();
		String client = "Trump Taj Mahal";
		String wrapping = "Newspaper";
		String delivery = "have cousin Vinnie drop it off";
		
		SlotMachine machine = njStore.orderMachine("bonus", client, wrapping, delivery);
		

		System.out.println();
		System.out.println();
		
		MachineStore nvStore = new NVSlotStore();
		String client2 = "The Peppermill";
		String wrapping2 = "saran wrap";
		String delivery2 = "shipping it with UPS";
		
		SlotMachine machine2 = nvStore.orderMachine("progressive", client2, wrapping2, delivery2);
		
	}

} 
