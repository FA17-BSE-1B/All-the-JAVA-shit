import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
public class Assignment3 {
  public static void main(String[] args) throws Exception{
            Scanner getInput = new Scanner(System.in);
            File studentFile = new File("database.txt");
            int userChoice = 1;
            while (userChoice != 0) {
                System.out.println("Student Record Management");
                System.out.println("1. Enter student data to the database");
                System.out.println("2. Read student data from the database");
                System.out.println("0. Exit program");
                System.out.print("Your selection: ");
                userChoice = getInput.nextInt();
                switch (userChoice) {
                    case 1:
                        writeData(studentFile, getInput);
                        break;
                    case 2:
                        if (studentFile.exists())
                            readData(studentFile, getInput);
                        else
                            System.out.println("File does not exists");
                        break;
                    case 0:
                        System.out.println();
                        System.out.println("Program Terminated");
                        break;
                    default:
                        System.out.println("Invalid selection");
                }
                System.out.println();
                System.out.println("===============================================================");
                System.out.println();
            }
        }

    public static void writeData(File studentFile, Scanner getInput) throws Exception{
            //Declaration block
            //Create object to write data to the file
            PrintWriter FileWriter = new PrintWriter(studentFile);
            int stdNum;
            //Working block
            System.out.println();
            System.out.println("===============================================================");
            System.out.println("Data Entry Portal");
            System.out.println("===============================================================");
            System.out.println();
            System.out.println("How many student do you want to enter data for?");
            stdNum = getInput.nextInt(); //Recieve number of students
            getInput.nextLine(); //Move the cursor to the next line
            Student [] std = new Student[stdNum]; //Array to store student data
            for (int i = 0; i < stdNum; i++){
                //Initialise each array index to store data for each student
                std[i] = new Student();
                System.out.println("Student " + (i+1));
                System.out.print("Name of the student: ");
                std[i].Name = getInput.nextLine(); //Recieve the name of the student as string
                System.out.print("Roll number: ");
                std[i].RollNo = getInput.nextLine(); //Recieve the roll number of the student as string
                System.out.print("Section: ");
                std[i].Section = getInput.nextLine(); //Recieve the section of the student as string
                System.out.print("CGPA: ");
                std[i].CGPA = getInput.nextFloat(); //Recieve the CGPA of the student as float
                getInput.nextLine(); //Move the cursor to the next line
                System.out.println("Record for " + std[i].Name + " successfully stored");
            }
            //Store the data recieved in the array into the file
            for (int i = 0; i < stdNum; i++){
                FileWriter.println(std[i].Name);
                FileWriter.println(std[i].RollNo);
                FileWriter.println(std[i].Section);
                FileWriter.println(std[i].CGPA);
            }
            FileWriter.close(); //Close the file
        }

        public static void readData(File studentFile, Scanner getInput) throws Exception{
            //Declaration block
            Scanner FileRead = new Scanner(studentFile);
            String searchName = "";
            int i, stdNum;
            //Working block
            stdNum = NumberOfRecords(studentFile); //Get the number of students in the file
            getInput.nextLine();
            System.out.println();
            System.out.println("===============================================================");
            System.out.println("Data Retrieval Portal");
            System.out.println("===============================================================");
            System.out.println();

            //Retrieve all the data in file to an array
            Student[] std = new Student[stdNum];
            i = 0;
            while (FileRead.hasNext()) {
                std[i] = new Student();
                std[i].Name = FileRead.nextLine();
                std[i].RollNo = FileRead.nextLine();
                std[i].Section = FileRead.nextLine();
                std[i].CGPA = FileRead.nextFloat();
                FileRead.nextLine(); //Move the cursor to the next line
                i++;//Next student
            }
            while (true) {
                System.out.println("Enter the name of the student to be searched\t\"Enter 0 to exit\"");
                searchName = getInput.nextLine();
                if (searchName.equals("0"))
                    break;
                for (i = 0; i < stdNum; i++) {
                    //Check whether the student's details are in the file or not
                    if (searchName.equals(std[i].Name)) {
                        //Display student details
                        System.out.println("Name: " + std[i].Name);
                        System.out.println("Roll Number: " + std[i].RollNo);
                        System.out.println("Section: " + std[i].Section);
                        System.out.println("CGPA: " + std[i].CGPA);
                        System.out.println();
                        break; //Terminated the search loop
                    }
                }
                if (i >= stdNum) //If student not found
                    System.out.println("Student not found");
            }
        }

        public static int NumberOfRecords(File studentFile) throws Exception{
            //Create Scanner object to read the data from file
            Scanner FileRead = new Scanner(studentFile);
            int lineCount = 0;
            while(FileRead.hasNext()){ //while not the end of file
                FileRead.nextLine(); //Go to next line
                lineCount++; //Count the line
            }
            /*Each student has 4 attributes, so number of students is obtained
              by dividing the number of lines by 4
            */
            return (lineCount / 4);
        }
    }

class Student{
        String Name;
        String RollNo;
        String Section;
        float CGPA;
}
