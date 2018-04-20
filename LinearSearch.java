import java.util.Scanner;
public class LinearSearch{
  public static void main(String[] args){
    //Declaration block
    Scanner getInput = new Scanner(System.in);
    int [] array = new int[5];
    int searchItem;
    boolean flag = false;
    int len = array.length;
    //Working block
    for (int i = 0; i < len; i++){
      System.out.print("Enter a number: ");
      array[i] = getInput.nextInt();
    }
    System.out.println("Enter anb item to be searched in the array");
    searchItem = getInput.nextInt();
    for (int i = 0; i < len; i++){
      if (array[i] == searchItem){
        System.out.println("Item found at index " + i);
        flag = true;
        break;
      }
    }
    if (flag == false)
      System.out.println("Item not found");
  }
}
//System.out.println();
