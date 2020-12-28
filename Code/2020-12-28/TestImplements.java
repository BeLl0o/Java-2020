interface PPerson{
    void say();
}
interface PParent{
    void work();
}

class CChild implements PPerson, PParent{
    public void work(){
        System.out.println("Study");
    }
    public void say(){
        System.out.println("Child");
    }
}

public class TestImplements {
    public static void main(String[] args){
        CChild c = new CChild();
        c.say();
        c.work();
    }
}
