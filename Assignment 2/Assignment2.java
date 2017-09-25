import java.util.Scanner; // to get inputs

/**
 * This class has the main class of the program 
 * This class inherits from the helper class "Parent"
 * @author Aman Nagpal
 * @version 1.0
 */

public class Assignment2 extends Parent{

    // declare variables 
    private String fname, lname, report;
    private Parent helper = new Parent();
    private double[] array = new double[7];

    /**
     * This is the main method the way into the program 
     * I choose to distribute the logic over various methods so that the 
     *  main function is small and there seems to be a flow to it 
     * @param args An array of strings
     */
    public static void main (String[] args) {
        /**
         * We create an instance of our class here
         * To call non -static method within static functions 
         * Since we are requested to not create any other static method
         */
        Assignment2 instance = new Assignment2();
        System.out.println("Enter -1 at any time to quit the program !");       
        // get the name of the user and the report's name 
        instance.getNames();
        // call the function that deals with numbers 
        instance.numericData();
        // display the data 
        instance.printData();
    }

    /**
     * This function handles getting numeric values from the user 
     * Calls methods from helper class to print average, heighest and lowest
     */
    public void numericData(){
        // create an array to get 7 integer input from users. 
        System.out.println("Please enter 7 numbers: .Enter -1 at any time to quit the program ");
        Scanner sn = new Scanner(System.in);
        for (int i=0, n=array.length; i<n; i++){
            System.out.print((i+1) + " Number: ");
            this.array[i] = sn.nextDouble();
            this.helper.checkQuit(Double.toString(array[i]));
            System.out.println("Summary");
            double[] summary = new double[3];
            // we send i+1 which is the length to which the array is filled 
            summary = this.helper.logic(array, i+1);
            System.out.println("Heighest Number: "+ summary[0]);      
            System.out.println("Lowest Number: "+ summary[1]);      
            System.out.println("Average: "+ summary[2]);      
        }
    
    }


   /**
    * THis methid gets first name, last name and report name
    * it is a void method and just populates instance variables 
    */
    public void getNames(){
         // get users first name and format it 
        this.fname = this.helper.getInput("Please enter your first name: ");
        this.fname = this.helper.formatString(fname);
        /**
         * The reson i choose to get an input an then break it into characters:-
         * From design prospective so the user doesnot have to enter each character
         * and then press enter. This way the user can just enter the name once and 
         * can break it down into cahracters and process it. 
         */
        this.lname = this.helper.getInput("Please enter your last name: ");
        this.lname = this.helper.formatString(lname);
        
        // Get the report name and format it 
        // We donot format the report name because might want to have it in format like 
        // Steve's Report 
        this.report = this.helper.getInput("Please enter the name of the report: ");
    
    }

    /**
     * This is a void method whose purpose is to print the information in the console
     * This method makes use of the instance variables
     */
    public void printData(){
        System.out.println("\n\n\n\n");
        System.out.println("--------------------- Final Summary ----------------------");
        System.out.println("User name: "+ this.fname + " " + this.lname);
        System.out.println("---- -----");
        System.out.println("Report's name: " + this.report);
        System.out.println("-------- -----");
        System.out.print("Numbers: ");
        for(double number: this.array){
            System.out.print(number + ", ");
        }
        System.out.println();
        System.out.println("--------");
        System.out.println("Average: " + this.helper.average(this.array, this.array.length));
        System.out.println("--------");
        System.out.println("Heighest: " + this.helper.heighest(this.array, this.array.length));
        System.out.println("---------");
        System.out.println("Lowest: " + this.helper.lowest(this.array, this.array.length));
        System.out.println("-------");
        // find the grand total of all the numbers average * array length
        double total = (this.helper.average(this.array, this.array.length)) * this.array.length;
        System.out.println("Grand Total: " + total);
        System.out.println("------------");
    }
}
