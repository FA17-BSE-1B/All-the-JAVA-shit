public class SelectionSort{
  public static void main(String[] args){
        int min;
        int minIndex;
        int[] array = {10, 7, 4, 3 , 2};
        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minIndex = j;
                    }
                }
            if (minIndex != i) {
                array[minIndex] = array[i];
                array[i] = min;
                }
            }
        }
}
