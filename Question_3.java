import java.util.Scanner;
public class Question_3{
  public static void main(String[] args){
    //Declaration and Initialization block
    Scanner getInput = new Scanner(System.in); 
    int num; 
    int hex; 
    //Working block
    System.out.print("Enter the number: ");
    num = getInput.nextInt();
    if (num >= 10 && num <= 15){
      hex = 'A' + (num - 10); 
      System.out.println("The hex value is " + (char)hex); 
    }
    else
      System.out.println("Invalid entry");

  }
}
