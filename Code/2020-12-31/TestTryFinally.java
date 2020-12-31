package test;

public class TestTryFinally{
    public static int div(int a, int b) {
        return a/b;
    }

    public static void main(String[] args){
        System.out.println("START");
        try{
            int val = div(10, 0);
            System.out.println(val);
        }catch(ArithmeticException e){
            System.out.println("Catches Exception" + e);
            return;
        }finally{
            System.out.println("Finaly"); 
        }
        System.out.println("OVER");
    }
      
}