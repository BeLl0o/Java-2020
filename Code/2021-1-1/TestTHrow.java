public class TestTHrow{
    public static int div(int a, int b){
        if(0 == b){
            throw new ArithmeticException("Error, no 0");
        }
        return a/b;
    }

    public static void main(String[] args){
        try{
            int val = div(10, 0);
            System.out.println(val);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}