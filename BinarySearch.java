import java.util.Scanner;
public class BinarySearch{
  public static void main(String[] args){
    Scanner getInput = new Scanner(System.in);
    int startItem, endItem, mid, searchItem;
    boolean flag = false;
    int [] num = {10, 15, 20, 25, 30};
    startItem = 0;
    endItem = num.length - 1;

    System.out.println("Key in a search term");
    searchItem = getInput.nextInt();
    do{
        mid = (startItem + endItem) / 2;
        if (num[mid] == searchItem){
            System.out.println("Item found at position: " + mid);
            flag = true;
        }
        else{
            if (startItem >= endItem){
                System.out.println("Item not found, search failed");
                flag = true;
            }
            else{
                if(num[mid] < searchItem)
                    startItem = mid + 1;
                else
                    endItem = mid - 1;
            }
        }
    }while(flag == false);
  }
}
