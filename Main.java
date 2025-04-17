package cgcc.edu.cs161;
// create string
//	MyString {
// instance Variable From an object
// use instance variable to call the public static void MyString
//
// Public static void MyString {
//       system.out.println("hello world!");
//{
public class Main {

	
	public static void main(String[] args) {
		Main myObject = new Main();
		myObject.MyString();
	}
	public static void MyString() {
		System.out.print("Hello world!");

	}
}
