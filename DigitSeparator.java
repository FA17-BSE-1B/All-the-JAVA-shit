import java.util.Scanner;

public class DigitSeparator{
  public static void main(String args[]){ // Main method
    Scanner input = new Scanner(System.in); //Object creation to take input from the user
    int num, count, i;
    System.out.print("Enter the number to be seperated: ");
    num = input.nextInt(); //Get the number from the user in the variable num
    count = DigCount(num); //Call the function DigCount and store the returning value in variable count
    int [] digit = new int[count]; //Initiate an array of the size of number of digits
    i = count - 1; //Index starts from zero, -1 to adjust the value to entertain array size
    while (i >= 0){
      digit[i] = Seperator(num);  //Call the separator method and get the digit
      num -= digit[i]; // Remove the extracted digit from the number
      num /= 10; // Remove the zero to make the number ready for next separation
      i -= 1; //Adjust the value of loop controlling variable for next iteration
    }
    for (int x: digit){ //For each loop in java is written like this
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
