public class TestFinally01 {
    public static int get(){
        int x = 1;
        try{
            ++x;
            return x;
        }finally{
            ++x;
            System.out.println("Finally" + x);
        } 
    }
    public static void main(String[] args){
        System.out.println("Final result" + get());
    }
}
