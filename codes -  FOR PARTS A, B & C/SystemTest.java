
public class SystemTest {

	public static void main(String[] args) {
		Systems ST = new Systems();
		
		// These methods set corresponding values
		ST.setMemorySize(600); // set Memory size in MB
		ST.setHardDiskSize(1.2); // set HardDisk size in GB
		ST.setPurchaseCost(865); // set HardDisk size in GB
		
		//  This method displays all system details
		
		String deviceMake = ST.getMake("Dell");
		System.out.println(deviceMake);
		
		String deviceModel = ST.getModel("G-Series");
		System.out.println(deviceModel);

		int processorSpeed = ST.getProcessorSpeed(3620);
		System.out.println("Device processor speed: "+processorSpeed + " Mhz");
		ST.displayDetails();
		
	    //  This method checks HardDisk size against a minimum
		boolean HdStatus = ST.checkHDStatus();
		System.out.println(HdStatus);
		
	    //  This method checks RAM memory size against a minimum
		boolean memSizeStatus = ST.goodMemorySize(100); 
		System.out.println(memSizeStatus);
		
		//This method runs a system diagnostic check on two methods
		String sysDiag = ST.diagnoseSystem();
		System.out.println(sysDiag);
		
		// Display OS parameters
		ST.displaySystemProperties();
		
		// Display multiple choices to user
		ST.printSystemDetails();
		
	}

}
