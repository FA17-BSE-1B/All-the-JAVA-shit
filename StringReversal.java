import java.util.Scanner;

public class StringReversal{
  public static void main(String[] args){
    int strLength;
    //Create Scanner object to take input
    Scanner input = new Scanner(System.in);
    //Prompt the user for an input
    System.out.println("Enter the string to be reversed");
    //Receive the input using the scanner object
    String str = input.nextLine();
    strLength = str.length();
    //Using a loop to reverse the string
    for (int i = strLength -1; i >= 0; i--){
      System.out.print(str.charAt(i));
    }
    System.out.println();
  }
}
