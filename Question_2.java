import java.util.Scanner;
public class Question_2{
  public static void main(String[] args){
    Scanner getInput = new Scanner(System.in);
    int num, reverse, exponent;
    String temp;
    reverse = 0;
    System.out.print("Enter the number: ");
    num = getInput.nextInt();
    temp = num + ""; 
    exponent = temp.length() - 1; 
    while (num > 0){
      reverse += (num % 10) * ((int)Math.pow(10, exponent));
      num /= 10;
      exponent--;
    }
    System.out.println("The reversed number is " + reverse);
  }
}
