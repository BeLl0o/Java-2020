public class TestBubbleSort {
    public static void main(String args[]){
        int[] array = {23, 45, 36, 67, 16};
        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j < array.length; j++){
                if(array[j] > array[i]){
                    int xch = array[j];
                    array[j] = array[i];
                    array[i] = xch;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
