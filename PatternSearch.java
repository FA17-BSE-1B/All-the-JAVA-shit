import java.util.Scanner;
public class PatternSearch{
  public static void main(String[] args) {
        boolean found;
        String str, pattern;
        int strLength, patternLegnth, position;
        Scanner input = new Scanner(System.in);
        str = "a quick brown fox jumps over the lazy dog to fix it";
        strLength = str.length();
        System.out.print("Enter the search item: ");
        pattern = input.nextLine();
        patternLegnth = pattern.length();
        for (int i = 0; i < strLength - patternLegnth; i++){
            position = i;
            found = true;
            int j = 0;
            while(j< patternLegnth && found){
                if ((str.charAt(position) != pattern.charAt(j)) && pattern.charAt(j) != '?'){
                    found = false;
                }
                position++;
                j++;
            }
            if (found)
                System.out.println("Pattern observed at " + i);
        }
    }
}
