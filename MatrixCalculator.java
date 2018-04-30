import java.util.Scanner;
public class MatrixCalculator{
  public static void main(String[] args) {
       //Declaration block
       Scanner getInput = new Scanner(System.in);
       int [][] mat = {{0,0,0,0}};
       boolean end = false;
       String userChoice = "";
       //Working block
       System.out.println("==================================================");
       System.out.println("                MATRIX CALCULATOR");
       while (end != true){
           //Set up welcome screen
           mainScreen();
           System.out.print("Select an option: ");
           userChoice = getInput.next();
           userChoice = userChoice.toUpperCase();
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
                  System.out.println("Key in the row you would like to be printed");
                  int row = getInput.nextInt();
                  printRow(row, mat);
                }
               case "C":
                {
                  System.out.println("Key in the column you would like to be printed");
                  int column = getInput.nextInt();
                  printColumn(column, mat);
                }
               case "M":
                {
                  multiplyMatrices();
                  break;
                }
               case "0":
                System.out.println();
                System.out.println("Program Terminated");
                end = true;
                break;
               default:
                System.out.println("Invalid selection");

           }
           //System.out.println();
       }

   }
   public static void mainScreen(){
       System.out.println("==================================================");
       System.out.println("E. Set Matrix");
       System.out.println("P. Print the Matrix");
       System.out.println("T. Transpose of the matrix");
       System.out.println("R. Print row of the matrix");
       System.out.println("C. Print column of the matrix");
       System.out.println("M. Multiply matrix");
       System.out.println("0. Exit");
       System.out.println();
   }

   public static int [][] setMat(){
       //Declaration block
       Scanner getInput = new Scanner(System.in);
       int rows, columns;
       int [][] mat;
       //Working block
       System.out.println("================================================");
       System.out.println("                Set Matrix");
       System.out.println("================================================");

       System.out.print("Key in the number of rows of the matrix: ");
       rows = getInput.nextInt();
       System.out.print("Key in the number of columns of the matrix: ");
       columns = getInput.nextInt();
       //Create matrix
       mat = new int[rows][columns];
       //Display the resulting Matrix
       System.out.println("Matrix has been set up for " + rows + " rows and " + columns + " columns");
       //Get matrix values
       System.out.println("Enter the individual values");
       for (int row = 0; row < rows; row++){
           for (int column = 0; column < columns; column++){
               System.out.print("Value: ");
               mat [row][column] = getInput.nextInt();
           }
       }
       System.out.println();
       displayMatrix(mat);
       System.out.println();
       enterToContinue();
       //Return the matrix created
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
       //enterToContinue();
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
      System.out.println();
      displayMatrix(transposeMat);
      enterToContinue();
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
     int row = 0; //Row for matrix one
     int column = 0; //Column for matrix one
     int r = 0; //Row for matrix two
     int c = 0; //Column for matrix two
        int temp = 0;
        int [][] matA = setMat();
        int [][] matB = setMat();
        int [][] matC = new int[matA.length][matB[0].length];
        if (matA.length == matB[0].length){
            while (row < matA.length){
                while (r < matB.length){
                    temp += matA[row][column] * matB[r][c];
                    column++; //Move to the next column in matrix one
                    r++; //Move to the next row in matrix two
                }
                matC[row][c] = temp;
                temp = 0;
                column = 0; r = 0;
                if (c == matB[0].length-1){ //If reached the end of second matrix
                    row++; //Go to the next row in matrix one
                    c = 0; //Reset the column number of matrix two
                }
                else
                    c++; //Go to the next column in matrix two
            }
            displayMatrix(matC);
          }
          else{
            System.out.println("Both the matrix are not of the same order");
          }
          enterToContinue();
   }

   public static void enterToContinue(){
       System.out.println("Press Enter key to continue...");
       try
       {
           System.in.read();
       }
       catch(Exception e)
       {}
   }
}
