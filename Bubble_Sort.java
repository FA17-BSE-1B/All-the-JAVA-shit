public class Bubble_Sort{
  public static void main(String[] args){

        //Declaration and initialization block
        int temp = 0;
        int [] num = new int[5]; //Create a new array reference of type integer and size 5
        int len = num.length-1; //Adjust the length varaible to tackle the array boundaries
        boolean loopFlag; //flag for whether a swap was made or not during a particular iteration

        //Working block
        for (int i = 0; i < 5; i++){
            num[i] = (int)(Math.random() * 10); //Generate random numbers and store them in array num in integer form
        }
        do{
            loopFlag = false; //Initially assume that no swap is made
            for (int i = 0; i < len; i++){
                if (num[i] > num[i+1]){
                    temp = num[i]; //Save the value of index i in a temporary varaible
                    num[i] = num[i+1]; //Replace the content of inde i with the contents of i + 1
                    num[i+1] = temp; //Replace the contents of i + 1 with the contents of the temporary varaible
                    loopFlag = true; //Swap was made
                }
            }
            len--;
        }while(loopFlag);

        //Display the array content
        for (int item: num){
            System.out.println(item);
        }
    }
}
