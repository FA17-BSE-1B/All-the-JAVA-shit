import java.util.Scanner;

public class Table{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int num, maxNum;

    System.out.print("Enter the number for which you want to get the table for: ");
    num = input.nextInt();
    System.out.print("Enter the max number for the table: ");
    maxNum = input.nextInt();
    for (int i = 1; i <= maxNum; i += 1){
      System.out.println(num + " x " + i + " = " + (num*i));
    }
  }
}
