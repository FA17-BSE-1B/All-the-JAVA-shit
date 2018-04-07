import java.util.Scanner;

public class StringReversal{
  public static void main(String[] args){
    int strLength;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the string to be reversed");
    String str = input.nextLine();
    strLength = str.length();
    for (int i = strLength -1; i >= 0; i--){
      System.out.print(str.charAt(i));
    }
    System.out.println();
  }
}
