import java.util.Scanner;

public class StringItemFinder{
  public static void main(String[] args){
    int numbers, letters, spaces, characters, strLength;
    String str;
    Scanner input = new Scanner(System.in);
    letters = 0;
    spaces= 0;
    characters = 0;
    numbers = 0;
    System.out.println("Enter your String");
    str = input.nextLine();
    strLength = str.length();
    for (int i = strLength-1; i >=0; i--){
      if ((str.charAt(i) >= 'A' && str.charAt(i) <='Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
        letters++;
      else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
        numbers++;
      else if (str.charAt(i) == ' ')
        spaces++; 
      else if (str.charAt(i) == '.' || str.charAt(i) == ',')
        characters++; 
    }
    System.out.println("There were " + letters + " letters, " + spaces + " spaces, " + numbers + " numbers and " + characters + " characters in the entered string");
  }
}
