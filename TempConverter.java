import java.util.Scanner;

public class TempConverter{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int choice;
    double temp;
    System.out.println("Welcome to the Temperature Converter");
    System.out.println("1. Celsius to Kelvin");
    System.out.println("2. Kelvin to Celsius");
    System.out.print("Enter your selection: ");
    choice = input.nextInt();
    if (choice == 1)
    {
      System.out.print("Key in the Celsius Temperature: ");
      temp = input.nextDouble();
      temp += 273.15;
      System.out.println("The Temperature in Kelvin is: " + temp);
    }
    else{
      System.out.print("Key in the Celsius Temperature: ");
      temp = input.nextDouble();
      temp -= 273.15;
      System.out.println("The Temperature in Celsius is: " + temp);
    }
  }
}
