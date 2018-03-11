import java.util.Scanner;

public class StringItemFinder{
  public static void main(String[] args){
    //Declaration block
    int numbers, letters, spaces, characters, strLength;
    String str;
    Scanner input = new Scanner(System.in);

    //Initialization block
    letters = 0;
    spaces= 0;
    characters = 0;
    numbers = 0;

    //Propmt the user for an input
    System.out.println("Enter your String");
    //Get the input
    str = input.nextLine();
    //Obtain the length of the String
    strLength = str.length();
    /*Initialise a loop to check each string for
    required items*/
    for (int i = strLength-1; i >=0; i--){
      //Check for alphabets
      if ((str.charAt(i) >= 'A' && str.charAt(i) <='Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
        letters++; //Increment if found
        //Check for numbers
      else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
        numbers++; //Increment if found
        //Check for spaces
      else if (str.charAt(i) == ' ')
        spaces++; //Increment if found
        //Check for special characters
      else if (str.charAt(i) == '.' || str.charAt(i) == ',')
        characters++; //Increment if found
    }
    System.out.println("There were " + letters + " letters, " + spaces + " spaces, " + numbers + " numbers and " + characters + " characters in the entered string");
  }
}
