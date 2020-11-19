public class TestTryCatch{
    public static int div(int a, int b){
        return a/b;
    }
    public static void main (String[] args){
        System.out.println("Start catch exception");
        try{
            int val = div(10, 0);
            System.out.println(val);
        }catch (ArithmeticException e){
            System.out.println("捕获到了异常" + e);
        }
            System.out.println("Compelete exception");
    }
}