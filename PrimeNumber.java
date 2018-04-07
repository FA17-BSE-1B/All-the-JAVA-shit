import java.util.Scanner;
public class PrimeNumber{
  public static void main(String[] args){
    //Declaration block
    Scanner input = new Scanner(System.in);
    int num, i;
    //Working block
    System.out.println();
    System.out.println("Enter the number to be checked");
    num = input.nextInt();

    for (i = 2; i < num; i++){
      if (num % i == 0)
        i = num;
    }
    if (i > num)
      System.out.println("The entered number " + num + " is not prime");
    else
      System.out.println("The entered number " + num + " is prime");
  }
}
