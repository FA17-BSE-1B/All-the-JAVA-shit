import java.util.Scanner;

public class CGPACal{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int eca_credit = 4; 
    int ict_credit = 3; 
    int isl_credit = 3; 
    int cal_credit = 3; 
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
    cGPA = (int)((total_gpa/total_credits) * 100) / 100.0;
    System.out.println("Your CGPA is: " + cGPA);
  }
}
