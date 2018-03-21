import java.util.Scanner;
public class Tokenizer{
  public static void main(String[] args){
    int words;
    String str="Today is Thursday.";
    int len = str.length();
    System.out.println(str.length());
    String word [] = new String[len];
    if (str.charAt(0) == ' '){
      System.out.println("There are spaces in the beginning");
      words = 0;
    }
    else{
      System.out.println("There are no spaces in the beginning");
      words = 1;
      word[words] = "";
    }
    int i = 0;
    while (i < len){
      if (str.charAt(i) == ' ' || str.charAt(i) == '.'){
        if (i < (len -1) && str.charAt(i+1) != ' '){
          words++;
          System.out.println(words);
          word[words-1] = "";
        }
      }else{
        word[words-1] += str.charAt(i);
      }
      i++;
    }
    System.out.println("Number of words in the strings is: " + words);

    i = 0;
    while(i < words){
      System.out.println(word[i]);
      i++;
    }
  }
}
