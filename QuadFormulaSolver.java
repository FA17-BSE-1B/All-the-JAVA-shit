import java.util.Scanner;
import java.text.DecimalFormat;

public class QuadFormulaSolver{
  public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int a,b,c;
    System.out.print("Key in the value of a: ");
    a = input.nextInt();
    System.out.print("Key in the value of b: ");
    b = input.nextInt();
    System.out.print("Key in the value of c: ");
    c = input.nextInt();
    QuadSolver(a,b,c);
  }
  public static void QuadSolver(int a, int b, int c){
    int det;
    det = (b * b) - 4 * a * c;
    if (det > 0)
    {
      System.out.println("The first root of the equation is: "+((-b)+Math.sqrt(det))/(2*a));
      System.out.println("The second root of the equation is: "+((-b)-Math.sqrt(det))/(2*a));
    }
    else{
      det *= -1;
      System.out.print("The first root of the equation is: ");
      System.out.print(-b/(2*a)+ "+");
      System.out.println(Math.round(Math.sqrt(det)/(2*a)) + "i");
      System.out.print("The second root of the equation is: ");
      System.out.print(-b/(2*a)+ "-");
      System.out.println(Math.round(Math.sqrt(det)/(2*a)) + "i");

    }
  }
}
