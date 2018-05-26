import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class Assignment3 {
  public static void main(String[] args) throws Exception{
            Scanner getInput = new Scanner(System.in);
            File studentFile = new File("database.txt");
            int usr = 1;
            while (userChoice != 0) {
                System.out.println("1. Enter student data to the database");
                System.out.println("2. Read student data from the database");
                System.out.println("0. Exit program");
                System.out.print("Your selection: ");
                usr = getInput.nextInt();
                switch (usr) {
                    case 1:
                        writeData(studentFile, getInput);
                        break;
                    case 2:
                        readData(studentFile, getInput);
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Invalid selection");
                }
            }
        }
    public static void writeData(File studentFile, Scanner getInput) throws Exception{
            PrintWriter FileWriter = new PrintWriter(studentFile);
            int stdNum;
            System.out.println("How many student do you want to enter data for?");
            stdNum = getInput.nextInt(); 
            getInput.nextLine(); 
            Student [] std = new Student[stdNum]; 
            for (int i = 0; i < stdNum; i++){
                std[i] = new Student();
                System.out.println("Student " + (i+1));
                System.out.print("Name of the student: ");
                std[i].Name = getInput.nextLine(); 
                System.out.print("Roll number: ");
                std[i].RollNo = getInput.nextLine(); 
                System.out.print("Section: ");
                std[i].Section = getInput.nextLine();
                System.out.print("CGPA: ");
                std[i].CGPA = getInput.nextFloat(); 
                getInput.nextLine();
                System.out.println("Record for " + std[i].Name + " successfully stored");
            }
            for (int i = 0; i < stdNum; i++){
                FileWriter.println(std[i].Name);
                FileWriter.println(std[i].RollNo);
                FileWriter.println(std[i].Section);
                FileWriter.println(std[i].CGPA);
            }
            FileWriter.close();
        }
        public static void readData(File studentFile, Scanner getInput) throws Exception{
            Scanner FileRead = new Scanner(studentFile);
            String searchName = "";
            int i, stdNum;
            stdNum = NumberOfRecords(studentFile); 
            getInput.nextLine();
            Student[] std = new Student[stdNum];
            i = 0;
            while (FileRead.hasNext()) {
                std[i] = new Student();
                std[i].Name = FileRead.nextLine();
                std[i].RollNo = FileRead.nextLine();
                std[i].Section = FileRead.nextLine();
                std[i].CGPA = FileRead.nextFloat();
                FileRead.nextLine(); 
                i++;
            }
            while (true) {
                System.out.println("Enter the name of the student\t\"Enter 0 to exit\"");
                searchName = getInput.nextLine();
                if (searchName.equals("0"))
                    break;
                for (i = 0; i < stdNum; i++) {
                    if (searchName.equals(std[i].Name)) {
                        System.out.println("Name: " + std[i].Name);
                        System.out.println("Roll Number: " + std[i].RollNo);
                        System.out.println("Section: " + std[i].Section);
                        System.out.println("CGPA: " + std[i].CGPA);
                        break;
                    }
                }
                if (i >= stdNum)
                    System.out.println("Student not found");
            }
        }
        public static int NumberOfRecords(File studentFile) throws Exception{
            Scanner FileRead = new Scanner(studentFile);
            int lineCount = 0;
            while(FileRead.hasNext()){ 
                FileRead.nextLine(); 
                lineCount++; 
            }
            return (lineCount / 4);
        }
    }

class Student{
        String Name;
        String RollNo;
        String Section;
        float CGPA;
}
