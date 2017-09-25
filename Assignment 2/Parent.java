import java.util.Scanner; // import to get user input
import java.lang.StringBuilder; // to create a new string 


/**
 * This Parent class is a helper class which has various methods that 
 * would be inhertited by the main class.
 *
 * @author Aman Nagpal
 * @version 1.0
 */

public class Parent{
    
    /**
     * This function takes in a string question and asks the user that question
     * @param question String question that is asked to the user     
     * @return input The answer that is inputed by the user
     */
    public String getInput(String question){
        Scanner sc = new Scanner(System.in);
        System.out.print(question);   
        String input = sc.nextLine(); // To wait till the user inputs.
        this.checkQuit(input);
        return input;     
    } 
    
    /**
     * This function removes any whitespaces and characters
     * from the string inputed by the user 
     * @param str The string inputed by the user 
     * @return newstr The new formated string 
     */
    public String formatString(String str){
        if(str != null && !str.isEmpty()){
            // we create an array of characters with the length of str
            // this way we know that there cannot be more characters than string
            StringBuilder newStr = new StringBuilder(str.length());
             for (char c: str.toCharArray()){
                 // loop throug each character and check weather it is a letter
                 if(Character.isLetter(c)){
                     newStr.append(c);
                 }
             }
             return newStr.toString();
        }  
        else {
             System.out.println("There was some problem with the string ");
        
        }
        return str;
    }
    
    /**
     * This method returns an array of highest, lowest and the average
     * of the numeric value of the input 
     * @param array an array of doubles 
     * @param length the lenght till which the array is filled
     * @return dataArray 
     *  - [0] Highest 
     *  - [1] Lowest 
     *  - [2] Average 
     */
    public double[] logic(double[] array, int length){
        double[] dataArray = new double[3];
        dataArray[0] = this.heighest(array, length);
        dataArray[1] = this.lowest(array, length);
        dataArray[2] = this.average(array, length);
        return dataArray; 
    } 
    
    /**
     * Find the number with the highest numeric value 
     * @param array array of numbers 
     * @param length the length to which the array is filled
     * @return max the highest number in the array 
     */
    public double heighest(double[] array, int length){
       double max = array[0]; 
       for (int i=0; i<length; i++){
            if(array[i] > max){
                max = array[i]; 
            } 
        }
       return max; 
    
    }
    
    /**
     * Find the lowest numebr in the array of numbers
     * @param array array of numbers 
     * @return min the lowest number in the array 
     */
    public double lowest(double[] array, int length){
        double min = array[0];
        for (int i=0; i<length; i++){
            if(array[i] < min){
                min = array[i]; 
            } 
         }
        return min; 
            
    }

    /**
     * This function finds the average of all the numbers 
     * @param array array of numbers 
     * @param length the length to which the array is filled
     * @return avg double value for average of numbers 
     */
    public double average(double[] array, int length){
        double avg = 0.0;
        for (int i=0; i<length ; i++){
            avg += array[i];
        } 
        return avg/length; 
    }

    /**
     * This function checks if the user has entered -1 and quits if he has 
     * @param str the string to compare 
     */
    public void checkQuit(String str){
        switch (str){
            /**
             * We write two cases -1 if user wants to quit somewhere else and 
             *  -1.0 if user wants to quit when entering doubles 
             */
            case "-1":
            case "-1.0":
                System.exit(0);
                break;
             
               
        } 
    
    }

}
