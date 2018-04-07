import java.util.Scanner;

public class Question_4{
  public static void main(String[] args){
    Scanner input;
    Boolean found;
    String str, item;
    int i, j, item_len, start, end;
    found = false;
    j = 0;
    input = new Scanner(System.in);
    System.out.println("Enter the string");
    str = input.nextLine();
    System.out.println("Enter the search item");
    item = input.nextLine();
    item_len = item.length();
    start = GetStart(str); 
    end = GetEnd(str); 
    i = start;
    while (i <= end){
      if (str.charAt(i) == item.charAt(j)){
        j++;
        if (j >= item_len){
          if (str.charAt(i+1) == ' ')
            found = true;
          i = end;
        }
      }
      else{
        j = 0;
      }
      i++;
    }
    if (found == true)
      System.out.println("True");
    else
      System.out.println("False");
  }
  public static int GetStart(String str){
    int space, word, i;
    i = 0;
    word = 0;
    do{
      if (str.charAt(i) == ' ')
        space = 1; 
      else{
        space = 0; 
        word = 1; 
      }
      i++;
    }while (word != 1 || space != 1);
    return i;
  }
  public static int GetEnd(String str){
    int space, word, i;
    i = str.length() - 1;
    word = 0;
    do{
      if (str.charAt(i) == ' ')
        space = 1; 
      else{
        space = 0; 
        word = 1; 
      }
      i--;
    }while (word != 1 || space != 1);
    i++;
    return i;
  }
}
