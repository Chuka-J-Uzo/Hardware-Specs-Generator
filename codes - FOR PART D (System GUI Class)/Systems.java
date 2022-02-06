/* Practical Programming Assignment 2
 * Assessment Task (PART D) -
 * This program presents the methods in PARTS A, B & C as interactive GUI Interfaces with buttons and display panels.
 */

// Import the java swing library for deploying GUI interfaces
import javax.swing.JOptionPane;

public class Systems {
	// Using private function here keeps the variables inaccessible to other functions
	// this prevents the mistaken reassignment or adoption of these variables by
	// another unrelated class or function.
	private int memorySize; // in MB
	private double hardDiskSize; // in GB
	private double purchaseCost; // in $

	// Constructor to initialize the make, model and processor speed
	public static void system(String[] make, String model, int speed) {

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
	public String getMake(String make) {
		System.out.println("\n" + "--- Device model details ---");
		return "Device make: " + make;
	}// end of "Device make" Getters

	public String getModel(String model) {
		return "Device model: " + model;
	} // end of "Device model" Getters

	public int getProcessorSpeed(int speed) {
		return speed;
	} // end of "Get Processor Speed" Getters

	// Start of display details method
	public String displayDetails() {
		return "\n" + "--- Device specifications --- " + "\n" + "Memory size: " + memorySize + " MB"
				+ "\nHardDisk size: " + hardDiskSize + " GB" + "\nPurchase Cost: $" + purchaseCost;
	}// end of "Display Details" method

	// Start of "Check Hard Disk Status" method
	public boolean checkHDStatus() {
		System.out.println("\n" + "--- Device status details --- ");
		if (hardDiskSize < 2.0) {
			System.out.print("HardDisk storage less than 2.0 GB space?  :");
			return true;
		} else {
			System.out.print("HardDisk storage less than 2.0 GB space?  :");
			return false;
		}
	}// end of "check Hard Disk Status" method

	
	// Start of "Good Memory size" method
	public boolean goodMemorySize(int i) {
		if (memorySize < 128) {
			System.out.print("RAM Memory size below 128 MB space?  :");
			return true;
		}
		System.out.print("RAM Memory size below 128 MB space?  :");
		return false;
	} // end of "Good Memory size" method

	
	// "Diagnose System" method starts here
	public String diagnoseSystem() {
		if (hardDiskSize < 2.0) {
			return "Hard disk size low";
		}
		return "Hard disk size is high";
	} // end of "Diagnose System" method

	
	// start of display System properties method
	public String displaySystemProperties() {
	
		String osName = System.getProperty("os.name");
		

		if (osName.equals("Windows 7")) {
			return "--- Operating System properties \n--- OS Architecture: "
					+ System.getProperty("os.arch").toUpperCase() + "\n OS Name: " + System.getProperty("os.name")
					+ "\n OS Version: " + System.getProperty("os.version") + "\n User Account Name: "
					+ System.getProperty("user.name") + "\n Java Version: " + System.getProperty("java.version")
					+ "\nCongrats! You have Windows 7 installed on this machine....";

		} else if (osName.equals("Linux")) {

			return "--- Operating System properties \nOS Architecture: "
					+ System.getProperty("os.arch").toUpperCase() + "\n OS Name: " + System.getProperty("os.name")
					+ "\n OS Version: " + System.getProperty("os.version") + "\n User Account Name: "
					+ System.getProperty("user.name") + "\n Java Version: " + System.getProperty("java.version")
					+ "\n\"Sorry!, Windows OS not installed on this machine...";
		}
		return "Operating system not available";
	} // end of display System properties method

	
	// "Print system details" method starts here
	public String printSystemDetails(String printOption) {

		// While loop to keep iterating choices till user exits
		while (0 < 3) {

			if (printOption.equals("1")) {
				return displayDetails();
			}
			if (printOption.equals("2")) {
				return displaySystemProperties();
			}
			if (printOption.equals("3")) {

				return diagnoseSystem();
			}
			if (printOption.equals("4")) {

//				Dialog message for cost
				JOptionPane.showMessageDialog(null, "Please specify a new purchase cost:", "Purchase Cost",
						JOptionPane.INFORMATION_MESSAGE);
				String cost = JOptionPane.showInputDialog("Enter value to set cost price");
				double purchaseCost = Double.parseDouble(cost);
				setPurchaseCost(purchaseCost);

//				Dialog message for memory size
				JOptionPane.showMessageDialog(null,
						"Please specify a new memory size value below (Value must be above or below 128 MB):",
						"Memory Size Capacity", JOptionPane.INFORMATION_MESSAGE);
				String str1 = JOptionPane.showInputDialog("Enter value to set memory size");
				int memValue = Integer.parseInt(str1);
				setMemorySize(memValue);

//				Dialog message for hard disk
				JOptionPane.showMessageDialog(null,
						"Please specify a new HardDisk size value below (Value must be above or below 2.0 GB):",
						"Hard Disk Capacity", JOptionPane.INFORMATION_MESSAGE);


				String str2 = JOptionPane.showInputDialog("Enter value to set hard disk size");
				double hardDiskValue = Double.parseDouble(str2);
				setHardDiskSize(hardDiskValue);

				return "Purchase cost: $" + purchaseCost + "\nNew memory size value is: " + memValue + " MB"
						+ "\nNew HardDisk space is: " + hardDiskValue + " GB";

			}

		} // end of While loop

	} // end of print system details

} // end of Systems class
