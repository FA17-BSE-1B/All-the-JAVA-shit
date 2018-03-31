import java.util.Scanner;
public class Question_3{
  public static void main(String[] args){
    //Declaration and Initialization block
    Scanner getInput = new Scanner(System.in); //Scanner object creation and initialization
    int num; //Varaible to hold the user num
    int hex; //Varaible to house the processed hex value
    //Working block
    System.out.print("Enter the number: "); //Prompt user for input
    num = getInput.nextInt(); //Obtain input as integer in num
    if (num >= 10 && num <= 15){
      hex = 'A' + (num - 10); //Obtain the hex value
      System.out.println("The hex value is " + (char)hex); //Display the obtained hex value
    }
    else
      System.out.println("Invalid entry"); //Display error message

  }
}
