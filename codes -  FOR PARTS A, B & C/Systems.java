import java.util.Scanner;

public class Systems 
{ 
	// Using private function here keeps the variables inaccessible to other functions
	// this prevents the mistaken reassignment or adoption of these variables by another unrelated class or function.
	private int memorySize; // in MB
	private double hardDiskSize; // in GB
	private double purchaseCost; // in $
	
	
	
	// Constructor to initialize the make, model and processor speed 
	public static void system (String[] make, String model, int speed)	{
   
	}
	
	// Getters and setters in this section receive values and set values here
	// Get Memory size
	public int getMemorySize() {
		return memorySize;
	}

	// Set Memory size
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}

	// Get HardDisk Size
	public double getHardDiskSize() {
		return hardDiskSize;
	}

	// Set hardDisk Size
	public void setHardDiskSize(double hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	// Get purchase Cost
	public double getPurchaseCost() {
		return purchaseCost;
	}

	// Set purchase cost
	public void setPurchaseCost(double purchaseCost) {
		this.purchaseCost = purchaseCost;
	} // end of Getters and setters in this section for receiving and setting values


   
	
				
	// System Getters to receive attributes for make, model and speed variables
	public String getMake(String make) 
	{
		System.out.println("\n" + "--- Device model details ---");
		return "Device make: "+ make;
	}// end of "Device make" Getters
	
	public String getModel(String model) 
	{
		return "Device model: "+ model;
	} // end of "Device model" Getters
	
	public int getProcessorSpeed(int speed)
	{
		return speed;
	} // end of "Get Processor Speed" Getters 
	
	
		
	// Start of display details method 
	public void displayDetails() 
	{
		System.out.println("\n" + "--- Device specifications --- " + "\n" + "Memory size: " + memorySize + " MB");
		System.out.println("HardDisk size: " + hardDiskSize + " GB");
		System.out.println("Purchase Cost: " + "$ "+ purchaseCost);
	}// end of "Display Details" method
	
	
	// Start of "Check Hard Disk Status" method 
	public boolean checkHDStatus() 
	{
		System.out.println("\n" + "--- Device status details --- " );
		if(hardDiskSize < 2.0){
			System.out.print("HardDisk storage less than 2.0 GB space?  :");
			return true;
		} else {
			System.out.print("HardDisk storage less than 2.0 GB space?  :");
			return false;
		}					
	}// end of "check Hard Disk Status" method
	
	
	// Start of "Good Memory size" method
	public boolean goodMemorySize(int i) 
	{
		if (memorySize < 128) {
			System.out.print("RAM Memory size below 128 MB space?  :");
			return true;
		}
		System.out.print("RAM Memory size below 128 MB space?  :");
		return false;
	} // end of "Good Memory size" method
	
	
	// "Diagnose System" method starts here
	public String diagnoseSystem() 
	{
		if(hardDiskSize < 2.0){
			System.out.print("Hard disk size = ");
			return "low"; 
		}
		return "high";
	} 
	// end of "Diagnose System" method 
	
	
	
	// start of display System properties method
	public void displaySystemProperties() 
	{	
		System.out.println("\n" + "--- Operating System properties ---");
		String osArchitecture = System.getProperty("os.arch");
		System.out.print("OS Architecture: ");
		System.out.println(osArchitecture.toUpperCase());
		
		String osName = System.getProperty("os.name");
		System.out.print("OS Name: ");
		System.out.println(osName);
		
		String osVersion = System.getProperty("os.version");
		System.out.print("OS Version: ");
		System.out.println(osVersion);
		
		String userAccName = System.getProperty("user.name");
		System.out.print("User Account Name: ");
		System.out.println(userAccName);
		
		String javaVersion = System.getProperty("java.version");
		System.out.print("Java Version: ");
		System.out.println(javaVersion + "\n");
		
		 if(osName.equals("Windows 7")) {
			 System.out.println("Congrats! You have Windows 7 installed on this machine....");
		 }else if(osName.equals("Linux")) { 
			 System.out.print("Sorry!, Windows OS not installed on this machine....");
			 }
	} // end of display System properties method
	
	
	// "Print system details" method starts here
	public void printSystemDetails() { 
		// First create a new scanner object to receive user input
		Scanner input = new Scanner(System.in);
				
		// While loop to keep iterating choices till user exits
		while(0<3) {
		System.out.println("\n" + "--- Service options ---");
		System.out.println("You may choose below an option to generate for you!" + "\n");
		System.out.println("Type '1' to Print System Details");
		System.out.println("Type '2' to Display system properties");
		System.out.println("Type '3' to Diagnose system");
		System.out.println("Type '4' to Set Details");
		System.out.println("Type '5' to Quit the program" + "\n" + "---------------" + "\n" + "Enter a number below: ");
		
		String answer; // New variable to receive Choices 1 to 5 inputs
		answer = input.next();
		
		// Conditional statements below to receive and evaluate module grade input
		
		if(answer.equals("1")){
			displayDetails();
			}
		if (answer.equals("2")) {
			displaySystemProperties();
			}	
		if (answer.equals("3")) {
			System.out.println("--- System diagnostics ---" );
			String passVariable = diagnoseSystem();			
			System.out.println(passVariable);
			}
		if (answer.equals("4")) {
			System.out.println("Please specify a new memory size value below (Value must be above or below 128 MB):");
			int memValue = input.nextInt(); //accept user input to set the Memory size here
			System.out.println("Initial memory size value: " + getMemorySize() + "MB");
			setMemorySize(memValue);
			System.out.println("New memory size value is: " + getMemorySize() + "MB");
			
			System.out.println("Please specify a new HardDisk size value below (Value must be above or below 2.0 GB):");
			double hardDiskValue = input.nextDouble(); //accept user input to set the Memory size here
			System.out.println("Initial HardDisk space is: " + diagnoseSystem());
			setHardDiskSize(hardDiskValue);
			System.out.println("New HardDisk space is: " + diagnoseSystem());
			}	
		if (answer.equals("5")) {
			System.out.println("Good bye! Program exited..");
			System.exit(0);
			}
	}// end of While loop
		    
} // end of print system details 
	
	
	
	
} // end of Systems class
