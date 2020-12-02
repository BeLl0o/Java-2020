import java.util.Scanner;

public class TestSolution{
    public static void main(String args[]){
        int[] num_array;
        num_array = new int[1000];
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()){
            int i = 0;
            num_array[i] = sc.nextInt();
        }
    }

}