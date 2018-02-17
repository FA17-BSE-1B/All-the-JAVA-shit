import java.util.Scanner;
import java.text.DecimalFormat;


public class GPACal{
  private static DecimalFormat d2f = new DecimalFormat(".##");
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int eca_credit = 4; //variable to store credits for ECA
    int ict_credit = 3; //variable to store credits for ICT
    int isl_credit = 3; //variable to store credits for Islamic Studies
    int cal_credit = 3; //variable to store credits for Calculus
    double total_credits, total_gpa, cGPA, eca, ict, isl, cal;
    total_credits = eca_credit + isl_credit + ict_credit + cal_credit;
    System.out.print("Enter your ECA GPA: ");
    eca = input.nextDouble();
    eca *= eca_credit; 
    System.out.print("Enter your ICT GPA: ");
    ict = input.nextDouble();
    ict *= ict_credit;
    System.out.print("Enter your Calculus GPA: ");
    cal = input.nextDouble();
    cal *= cal_credit;
    System.out.print("Enter your Islamic Studies GPA: ");
    isl = input.nextDouble();
    isl *= isl_credit;
    total_gpa = eca + isl + ict + cal;
    cGPA = total_gpa/total_credits;
    System.out.println("Your CGPA is: " + d2f.format(cGPA));

  }
}
