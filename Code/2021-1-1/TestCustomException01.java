class DivException extends Exception{
    public DivException(){
        super();
    }
    public DivException(String message){
        super(message);
    }
}

public class TestCustomException01 {
    public static int div(int a, int b) throws DivException{
        if(0 == b){
            throw new DivException("No zero");
        }
        return a/b;
    }

    public static void main(String args){
        try{
        int val = div(10, 0);
        System.out.println(val);
        }catch(DivException e){
        System.out.println(e.getMessage());
        }
    }    
}

