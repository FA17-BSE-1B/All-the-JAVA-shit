import java.util.Scanner;
public class MatrixCalculator{
  public static void main(String[] args) {
       Scanner getInput = new Scanner(System.in);
       int [][] mat = {{0,0,0,0}};
       boolean end = false;
       String userChoice = "";
       while (end != true){
           mainScreen();
           System.out.print("Select an option: ");
           userChoice = getInput.next();
           switch (userChoice){
               case "E":
                {
                  mat = setMat();
                }
               case "P":
                {
                  displayMatrix(mat);
                }
               case "T":
                {
                  transpose();
                }
               case "R":
                {
                  System.out.println("Enter row");
                  int row = getInput.nextInt();
                  printRow(row, mat);
                }
               case "C":
                {
                  System.out.println("Enter column");
                  int column = getInput.nextInt();
                  printColumn(column, mat);
                }
               case "M":
                {
                  multiplyMatrices();
                  break;
                }
               case "0":
                end = true;
                break;
               default:
                System.out.println("Invalid selection");

           }
       }

   }
   public static void mainScreen(){
       System.out.println("E. Set Matrix");
       System.out.println("P. Print the Matrix");
       System.out.println("T. Transpose of the matrix");
       System.out.println("R. Print row of the matrix");
       System.out.println("C. Print column of the matrix");
       System.out.println("M. Multiply matrix");
       System.out.println("0. Exit");
   }

   public static int [][] setMat(){
       Scanner getInput = new Scanner(System.in);
       int rows, columns;
       int [][] mat;
       System.out.print("Enter number of rows of the matrix: ");
       rows = getInput.nextInt();
       System.out.print("Enter number of columns of the matrix: ");
       columns = getInput.nextInt();
       mat = new int[rows][columns];
       System.out.println("Enter values");
       for (int row = 0; row < rows; row++){
           for (int column = 0; column < columns; column++){
               System.out.print("Value: ");
               mat [row][column] = getInput.nextInt();
           }
       }
       displayMatrix(mat);
       return mat;
   }

   public static void displayMatrix(int [][] mat){
       int rows, columns;
       rows = mat.length;
       columns = mat[0].length;
       for (int row = 0; row < rows; row++){
           for (int column = 0; column < columns; column++){
               System.out.printf("%-4d",mat[row][column]);
           }
           System.out.println();
       }
   }

   public static void transpose(){
      int [][] matA = setMat();
      int [][] transposeMat = new int [matA.length][matA[0].length];
      for (int row = 0; row < matA.length; row++){
          for (int column = 0; column < matA[0].length; column++){
              transposeMat[row][column] = matA[column][row];
          }
      }
      displayMatrix(matA);
      displayMatrix(transposeMat);
   }

   public static void printRow(int row, int [][] mat){
     for (int column = 0; column < mat[0].length; column++){
       System.out.printf("%-4d", mat[row][column]);
     }
   }

   public static void printColumn(int column, int [][] mat){
     for (int row = 0; column < mat[0].length; row++){
       System.out.printf("%-4d", mat[row][column]);
     }
   }

   public static void multiplyMatrices(){
     int row = 0; 
     int column = 0; 
     int r = 0; 
     int c = 0; 
        int temp = 0;
        int [][] matA = setMat();
        int [][] matB = setMat();
        int [][] matC = new int[matA.length][matB[0].length];
        if (matA.length == matB[0].length){
            while (row < matA.length){
                while (r < matB.length){
                    temp += matA[row][column] * matB[r][c];
                    column++; 
                    r++; 
                }
                matC[row][c] = temp;
                temp = 0;
                column = 0; r = 0;
                if (c == matB[0].length-1){ 
                    row++; 
                    c = 0; 
                }
                else
                    c++; 
            }
            displayMatrix(matC);
          }
          else{
            System.out.println("Both the matrix are not of the same order");
          }
   }
}
