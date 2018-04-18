import java.util.Scanner;
public class SirsSort{
  public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int [] list = new int[5];
        int [] b = {1, 1, 1, 1, 1};
        int [] index = new int[5];
        int minNum, minIndex, largestNum, largestIndex;
        System.out.print("Key in a number: ");
        list[0] = input.nextInt();
        largestNum = list[0];
        largestIndex = 0;
        for (int i = 1; i < 5; i++) {
            System.out.print("Key in a number: ");
            list[i] = input.nextInt();
            if (list[i] > largestNum){
                largestNum = list[i];
                largestIndex = i;
            }
        }
        for (int i = 0; i < 5; i++){
            minNum = largestNum;
            minIndex = largestIndex;
            for (int j = 0; j < 5; j++){
                if (minNum > list[j] && b[j] != 0){
                    minNum = list[j];
                    minIndex = j;
                }
            }
            b[minIndex] = 0;
            index[i] = minIndex;
        }
        for (int i = 0; i < 5; i++){
            System.out.println(list[index[i]]);
        }
    }
}
