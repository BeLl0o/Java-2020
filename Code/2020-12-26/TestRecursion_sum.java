//20!+19!+...+1!
public class TestRecursion_sum {
    public static void main(String[] args){
        int sum = 0;
        for (int i = 1; i <= 20; i++ ){
            sum += fact(i);
        }
        System.out.println(sum);
    }
   public static long fact(int n){
       if(n == 0){
           return 1;
       }
       return n * fact(n-1);
   }
}
