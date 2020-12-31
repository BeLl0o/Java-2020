package test;
public class TestDivException{
    public static int div(int a, int b){
        return a/b;
    }
    public static void main (String[] args){
        int val = div(10, 0);
        System.out.println(val); 
    }
} 