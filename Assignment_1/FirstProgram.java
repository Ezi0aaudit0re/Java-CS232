import java.util.Scanner; 

public class FirstProgram
{
	public static void main(String[] args){
		// Prints the string within double quotes 
		System.out.println("Hello, Aman. This is your first java program");	
		System.out.println("THis program adds two numbers");		
		// Declare two variables 
		int n1, n2;
		// What does this line do ?
		Scanner key = new Scanner (System.in); // Get an input from the keybaord through the nextInt() method  
		System.out.print("Enter first integer: ");
		n1 = key.nextInt();
		System.out.print("Enter second integer: ");
		n2 = key.nextInt();
		System.out.print("The sum of the nubers is: ");
		System.out.println(n1 + n2);
		System.out.println("Exiting the program");
	}	
}
