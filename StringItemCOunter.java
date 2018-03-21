import java.util.Scanner;
public class StringItemCOunter{
  public static void main(String[] args){
    //Declaration block
    Scanner input;
    int numerics, alphabets, len;
    String str;
    //Initialization block
    numerics = 0;
    alphabets = 0;
    input = new Scanner(System.in);
    //Working block
    System.out.println("Enter the string "); //Prompt user for input
    str = input.nextLine(); //Get the string from the user
    len = str.length(); //Obtain the string length
    for (int i = 0; i < len; i++){
      if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
          alphabets++;
      else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
          numerics++;
    }
    System.out.println("The number of alphabets is " + alphabets);
    System.out.println("The number of numerics is " + numerics);
  }
}
