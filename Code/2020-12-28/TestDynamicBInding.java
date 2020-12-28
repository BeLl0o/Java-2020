class Person5{
    public void say(){
        System.out.println("Person");
    }
}
class Parent5 extends Person5{
    public void say(){
        System.out.println("Parent");
    }
}
class Child5 extends Parent5{}

public class TestDynamicBInding {
    public static void main(String[] args){
        Person5 p = new Child5();
        p.say();
    }   
}
