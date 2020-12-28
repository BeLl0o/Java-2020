class Person7{
    public void say(){
        System.out.println("Person");
    }
}
class Parent7 extends Person7{
    public void say(){
        System.out.println("Parent");
    }
}
class Child7 extends Parent7{
    public void say(){
        System.out.println("Child");
    }    
}
public class TestTypeCast {
    public static void main(String[] args){
        Person7 p = new Child7();//向上转型（隐式转换）
        Parent7 o = (Parent7)p;//向下转型（显式转换） 
        o.say();
    }
}
