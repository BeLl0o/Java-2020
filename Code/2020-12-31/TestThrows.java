public class TestThrows {
    public static int div(int a, int b) throws ArithmeticException{
        return a/b;
    }

    public static void main(String[] args){
        try{
            int val = div(10, 2);
            System.out.println(val);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
    
}
