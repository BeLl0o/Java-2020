class Person{
    public void say(){
        System.out.println("Person");
    }
}
class Parent4 extends Person{
    public void say(){
        System.out.println("Parent");       
    }
}
class Child4 extends Parent4{//一个类只能向上向父类转化
    public void say(){
        System.out.println("Child");       
    }
}
public class TestPolymorphism {
    public static void main(String[] args){
        Person p = null;
        p = new Parent4();
        p.say();
        p = new Child4();
        p.say();
        Parent4 p1 = new Child4();
        p1.say();
    }
}

