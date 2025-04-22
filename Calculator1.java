package cgcc.edu.cs161;
// make an instance onto an object called calculator
public class Main {
	
	// make the variable for the calculations
	static int a = 20;
	// use a double variable for the non whole number
	static double b = 1.5;
	
	public static void main(String[] args) {
	// maker the string and create thwe object for the instance variable	
		Main myObject = new Main();
		// call on "calculator" so that it prints out the answer
			myObject.calculator();
	}	
	// craete the calculator to find out the product of 20x1.5 
	public void calculator() {
				System.out.println(a*b);
			}
}
// 
