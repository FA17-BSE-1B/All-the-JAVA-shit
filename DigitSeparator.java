import java.util.Scanner;

public class DigitSeparator{
  public static void main(String args[]){ 
    Scanner input = new Scanner(System.in);
    int num, count, i;
    System.out.print("Enter the number to be seperated: ");
    num = input.nextInt(); 
    count = DigCount(num); 
    int [] digit = new int[count];
    i = count - 1; 
    while (i >= 0){
      digit[i] = Seperator(num);
      num -= digit[i]; 
      num /= 10;
      i -= 1;
    }
    for (int x: digit){ 
      System.out.println(x);
    }
  }
  public static int DigCount(int num){
    int count = 0;
    while (num >= 1){
      num = num / 10;
      count += 1;
    }
    return count;
  }
  public static int Seperator(int num){
    int digit;
    digit = num % 10;
    return digit;
  }
}
