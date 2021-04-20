public class PAssign01 {
	public static void main(String[] args) {
// Create your Desk instances here
	Desk desk1 = new Desk();
			desk1.NewDrawer(5);
			desk1.NewSur(43.50);
			desk1.Standing();
			desk1.NewMat("Birch");
			desk1.NewManfu("Tennessee");
		System.out.println("Desk Information");
		System.out.println("Number Drawers:\t"+ desk1.NumbDrawers);
		System.out.printf("Surface Height:\t%.2f inches\n",desk1.SurHeight);
		System.out.println("Standing:\t\t"+ desk1.Stand);
		System.out.println("Material:\t\t"+ desk1.Material);
		System.out.println("Manufactured:\t\t"+ desk1.Manfu);
		System.out.println("");
		System.out.println("Total number of desks: "+ Desk.numberOfDesk + "\n");
		
	Desk desk2 = new Desk();
			desk2.NewDrawer(8);
			desk2.NewSur(29.20);
			desk2.NewMat("Mahogany");
			desk2.NewManfu("California");
		System.out.println("Desk Information");
		System.out.println("Number Drawers:\t"+ desk2.NumbDrawers);
		System.out.printf("Surface Height:\t%.2f inches\n",desk2.SurHeight);
		System.out.println("Standing:\t\t"+ desk2.Stand);
		System.out.println("Material:\t\t"+ desk2.Material);
		System.out.println("Manufactured:\t\t"+ desk2.Manfu);
		System.out.println("");
		System.out.println("Total number of desks: "+ Desk.numberOfDesk);
	
	Desk desk3 = new Desk();
			desk3.NewDrawer(3);
			desk3.NewSur(27);
		System.out.println("");
		System.out.println("Desk Information");
		System.out.println("Number Drawers:\t"+ desk3.NumbDrawers);
		System.out.printf("Surface Height:\t%.2f inches\n",desk3.SurHeight);
		System.out.println("Standing:\t\t"+ desk3.Stand);
		System.out.println("Material:\t\t"+ desk3.Material);
		System.out.println("Manufactured:\t\t"+ desk3.Manfu);
		System.out.println("");
		System.out.println("Total number of desks: "+ Desk.numberOfDesk);
		/* The reason I formatted with .println instead of .format cause 
		 * it looks cleaner(more visually appealing) than one long line
		 *System.out.println(desk2.getInfo());
		 */
	}
	
}

class Desk {
	// Implement your Desk class code here
	int NumbDrawers = 4; // default is 4
	double SurHeight = 27.0 ; // default is27
	boolean Stand = false; // default is false(not standing)
	String Material = "Pine"; //default is Pine
	String Manfu = "North Carolina"; // default N.C
	static int numberOfDesk = 0; //counter of desks
	
	
	Desk(){
	numberOfDesk++;
	}
	
	void NewDrawer(int draw) {
		NumbDrawers = draw;
	}
	
	void NewSur(double height){
		SurHeight = height;
	}
	void Standing(){
		Stand = true;
	}
	void NewMat(String name){
		Material = name;
	}
	void NewManfu(String name) {
		Manfu = name;
	}
	 String getInfo() {
		return String.format("Desk Information\nNumber Drawers:\t%d\nSurface Height:\t%.2f inches\nStanding:\t%b\nMaterial:\t%s\nManufactured:\t%s", NumbDrawers, SurHeight, Stand, Material, Manfu);
	
	}
	
	/*
	Description
Write a Java program to model a Desk with simple characteristics.  Design a Desk class to model a real-world Desk. The class should contain data members to represent the following things:  number of drawers, whole numbers only, default is 4 drawers; surface height, measured in inches, can contain decimal values, default 27.0 inches; whether or not the Desk is a standing desk, default false; type of material, default Pine; state of manufacture, default North Carolina; and a static member that keeps track of the total numbers of Desks created.

Use Java naming conventions for all data members.

Additionally, the class should contain a no-arg default constructor that creates a Desk with all default values.  There should be a convenience constructor that creates a Desk with a specified number of drawers passed to the constructor.  Other constructors may be added as desired but are not required.  Finally, there should be a method named getInfo() that returns a description for the Desk.  This description should include formatted, descriptive information about all data members.  The expected output provides the required format for this string.  Recall that String.format() works similarly to System.out.printf().

Draw/sketch the UML diagram for the Desk class and then implement the class in Java.  Submit an image of this UML diagram with your project. 

In the main method, provide a test program that creates three individual Desks, sets values for data members, and then prints out the information as shown.  Use the most logical constructor to create each Desk.  Additionally, after printing each Desk’s information, print the total number of Desks.  The number of Desks should come directly from the Desk class and should not be calculated in the main method or hard-coded.

Expected Output
Desk Information
Number Drawers:	5
Surface Height:	43.50 inches
Standing:		true
Material:		Birch
Manufactured:		Tennessee

Total number of desks: 1

Desk Information
Number Drawers:	8
Surface Height:	29.20 inches
Standing:		false
Material:		Mahogany
Manufactured:		California

Total number of desks: 2

Desk Information
Number Drawers:	3
Surface Height:	27.00 inches
Standing:		false
Material:		Pine
Manufactured:		North Carolina

Total number of desks: 3

Code
To simplify submission into a single Java file, use the following template for your class:
public class PAssign01 {
	public static void main(String[] args) {
// Create your Desk instances here
	}
}

class Desk {
	// Implement your Desk class code here
}

Deliverables
Name your program PAssign01.java.  Programming Assignment 1 is to be individual work.  

NOTE:  An image of your UML diagram should be submitted with your code PDF.

We may use an automatic checker to check the output of the program.  Use a utility similar to https://www.diffchecker.com/ and the Expected Output to compare your program’s output with the requested output.  Programming is in the details, so double check punctuation, spacing, and case if your output does not match.  When copying and pasting, be aware that Microsoft Word sometimes replaces normal quotes with Smart Quotes, which may need to be edited.

The final grade will be determined based on a manual examination of your code. 
Finally, if you need help you can always ask me. But please do not cheat in your submissions. We use code similarity checkers for finding out duplicates.

	 */
	
	
	
	}
	
	


