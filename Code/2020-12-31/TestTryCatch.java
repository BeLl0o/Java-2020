package test;
public class TestTryCatch {
    public static int div(int a, int b){
        return a/b;
    }
    public static void main(String[] args){
        System.out.println("Start Catch Exception");
    
    try{
        int val = div(10, 0);
        System.out.println(val);
    }catch(ArithmeticException e){
        System.out.println("Catches exception" + e);
        int val = div(10, 2);
        System.out.println("Final result after catching " + val);
        
    }
    System.out.println("Stop Catch Exception");
    }
}
