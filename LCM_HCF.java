import java.util.Scanner;
public class LCM_HCF{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int num1, num2, gcd, lcm;
    gcd = 0;
    System.out.print("Enter the first number: ");
    num1 = input.nextInt();
    System.out.print("Enter the second number: ");
    num2 = input.nextInt();
    for (int i = 1; i <= num1 && i <= num2; i++){
      if (num1 % i == 0 && num2 % i == 0)
        gcd = i;
    }
    lcm = (num1 * num2) / gcd;//Obtain LCM using the formula
    System.out.println("The LCM of the numbers " + num1 + " and " + num2 + " is " + lcm);
    System.out.println("The HCF of the numbers " + num1 + " and " + num2 + " is " + gcd);
  }
}
