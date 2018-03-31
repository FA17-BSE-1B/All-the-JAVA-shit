import java.util.Scanner;
public class Question_2{
  public static void main(String[] args){
    //Declaration block
    Scanner getInput = new Scanner(System.in);
    int num, reverse, exponent;
    String temp;
    //Initialization block
    reverse = 0;
    //Working block
    System.out.print("Enter the number: ");
    num = getInput.nextInt();
    temp = num + ""; //Convert number to a string
    exponent = temp.length() - 1; //Obtain the length of the string number
    while (num > 0){
      reverse += (num % 10) * ((int)Math.pow(10, exponent));
      num /= 10;
      exponent--;
    }
    System.out.println("The reversed number is " + reverse);
  }
}
