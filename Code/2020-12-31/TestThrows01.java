package test;

public class TestThrows01 {
    public static int div(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public static void main(String[] args){
        int val = div(10, 0);
        System.out.println(val);
    }
}
