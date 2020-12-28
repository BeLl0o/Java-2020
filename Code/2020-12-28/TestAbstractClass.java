abstract class _Parent{
    public abstract void say();
}

class _Child extends _Parent{
    public void say(){
        System.out.println("Child");
    }
}

public class TestAbstractClass {
    public static void main(String[] args){
    _Child c = new  _Child();
    c.say();
    }
}
