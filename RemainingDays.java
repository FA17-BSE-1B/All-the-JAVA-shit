import java.util.Scanner;
public class RemainingDays{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int date, month, monthDays, remainingDays;
    remainingDays = 0;
    System.out.println("Enter the month in terms of numbers 1,2,3 etc.");
    month = input.nextInt();
    System.out.println("Enter the date of the month");
    date = input.nextInt();
    switch (month){
      case 1:
        monthDays = 31;
        remainingDays += monthDays - date;
        date = 0;
      case 2:
        monthDays = 28;
        remainingDays += monthDays - date;
        date = 0;
      case 3:
        monthDays = 31;
        remainingDays += monthDays - date;
        date = 0;
      case 4:
       monthDays = 30;
       remainingDays += monthDays - date;
       date = 0;
      case 5:
        monthDays = 31;
        remainingDays += monthDays - date;
        date = 0;
      case 6:
        monthDays = 30;
        remainingDays += monthDays - date;
        date = 0;
      case 7:
        monthDays = 31;
        remainingDays += monthDays - date;
        date = 0;
      case 8:
        monthDays = 31;
        remainingDays += monthDays - date;
        date = 0;
      case 9:
        monthDays = 30;
        remainingDays += monthDays - date;
        date = 0;
      case 10:
        monthDays = 31;
        remainingDays += monthDays - date;
        date = 0;
      case 11:
        monthDays = 30;
        remainingDays += monthDays - date;
        date = 0;
      case 12:
        monthDays = 31;
        remainingDays += monthDays - date;
        date = 0;
    }
    System.out.println("The remaining days of the year are : " + remainingDays);
  }
}
