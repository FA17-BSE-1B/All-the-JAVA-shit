import java.util.Scanner;
public class MultipleCharFinder{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int j, foundCount, strLength, searchLength, index;
    String str, searchItem;
    j = 0;
    foundCount = 0;
    index = 0;
    str = input.nextLine();
    strLength = str.length();
    searchItem = input.nextLine();
    searchLength = searchItem.length();
    for (int i = 0; i < strLength; i++){
      if (searchItem.charAt(j) == str.charAt(i)){
        if (j == 0){
          index = i;
        }
        j++;
      }else{
        j = 0;
      }
      if (j == searchLength){
        System.out.println("Item found at index: " + index);
        j = 0;
        foundCount++;
      }
    }
    if (j==0){
      System.out.println("Search Item " + searchItem + " found at " + foundCount + " places");
    }else{
      System.out.println("Item not found");
    }
  }
}
