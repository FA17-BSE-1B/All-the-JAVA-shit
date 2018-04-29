public class Bubble_Sort{
  public static void main(String[] args){
        int temp = 0;
        int [] num = new int[5]; 
        int len = num.length-1;
        boolean loopFlag; 
        for (int i = 0; i < 5; i++){
            num[i] = (int)(Math.random() * 10);
        }
        do{
            loopFlag = false; 
            for (int i = 0; i < len; i++){
                if (num[i] > num[i+1]){
                    temp = num[i];
                    num[i] = num[i+1];
                    num[i+1] = temp; 
                    loopFlag = true; 
                }
            }
            len--;
        }while(loopFlag);
        for (int item: num){
            System.out.println(item);
        }
    }
}
