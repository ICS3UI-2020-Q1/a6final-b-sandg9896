import java.util.Scanner;
/**
 * check to see if both arrays are the same or are not and output that to the user
 * @ Gavin Sandhar 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    // create array to represent first set of numbers
    int[] first = new int[5];
   
    // ask user to enter 5 numbers    
    System.out.println("Please enter the values for the first array:");
    
    // create for loop for first set numbers
    for(int i = 0; i < first.length; i++){
      first[i] = input.nextInt();
    }
    
    // create array to represent second set of numbers
    int[] second = new int[5];

    // ask user to enter 5 numbers    
    System.out.println("Please enter the values for the second array:");
    
    // create for loop for second set numbers
    for(int i = 0; i < second.length; i++){
      second[i] = input.nextInt();
    }
    // create if else statement to determine if the values are the same or not
    int i = 0;
    if(first[i] == second[i]){
      System.out.println("These arrays are the same");
    }else{
      // tell them the arrays aren't the same
      System.out.println("These arrays are not the same");
    }
  }
}
 
  

