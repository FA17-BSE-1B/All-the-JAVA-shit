import java.util.Scanner;

public class CharSeparator{
  public static void main(String[] args){
    boolean found = false;
    int j = 0;
    int position = 0;
    Scanner input = new Scanner(System.in);
    String str = "a quick brown fox jumps over the lazy";
    int strLength = str.length();
    System.out.print("Enter the search item: ");
    String searchItem = input.nextLine();
    System.out.println(searchItem);
    int searchLength = searchItem.length();
    int i = 0;
    while (i < strLength){
      if (searchItem.charAt(j) == str.charAt(i)){
        if (j == 0){
          position = i;
        }
        j++;
      }
      else{
        j = 0;
      }
      if (j == searchLength){
        found = true;
        i = strLength;
      }
      else{
        found = false;
      }
      i++;
    }
    if (found == true){
      System.out.println("Item found at: " + position);
    }
    else{
      System.out.println("Item not found");
    }
  }
}
