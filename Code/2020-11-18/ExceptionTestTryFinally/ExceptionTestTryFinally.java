public class TestTryFinally{
    public static int div(int a, int b){
        return a/b;
    }
    public static void main(String args[]){
    try{
        int num = div(123, 0);
        System.out.println(num);
    }catch(ArithmeticException num){
        System.out.println("!ArithmeticException");
    }finally{
        System.out.println("Exerting finally");
    }
    System.out.println("Compelete");
}
}