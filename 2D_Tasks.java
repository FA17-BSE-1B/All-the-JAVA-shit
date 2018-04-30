import java.util.Scanner;
public class 2D_Tasks{
  public static void main(String[] args){
            Scanner getInput = new Scanner(System.in);
            int [][] array = new int [5][5];
            int item, i;
            i = 0;
            for (int row = 0; row < 5; row++)
                for (int column = 0; column < 5; column++){
                    i++;
                    array[row][column] = i;
                }
            printArray(array);
            System.out.print("Key in a column number: ");
            item = getInput.nextInt();
            int [] col = task(array, item);
            for (int j: col){
                System.out.println(j);
            }
        }
        public static void printArray(int [][] a){
            for (int row = 0; row < 5; row++) {
                for (int column = 0; column < 5; column++)
                    System.out.printf("%-4d",a[row][column]);
                System.out.println();
            }
        }
        public static int [] task(int [][] a, int c){
            int [] column = new int[5];
            if (c < 0){
                int row = 0;
                int col = 0;
                while (row < 5 && col < 5){
                    column[row] = a[row][col];
                    row++;
                    col++;
                }
            }
            else{
                for (int row = 0; row < 5; row++){
                    System.out.print(a[row][c] + "    ");
                    System.out.println();
                    column[row] = a[row][c];
                }
            }
            return column;
        }
}
