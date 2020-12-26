public class TestThis {
    public static void main(String[] args){
        Person1 p = new Person1("zhang3", 18);
        p.say();
    }
}
class Person1{
    private String name;
    private int age;
    public Person1(){
        System.out.println("调用无参构造函数");
    }
    public Person1(String name, int age){
        this();
        System.out.println("调用有参构造函数"); 
        this.name = name;
        this.age = age;
    }
    
    public void log(String msg){
        System.out.println("Dairy: call" + msg);
    }
    public void say(){
        System.out.println("Name:" + name +",Age" + age);
        this.log("Person.say");
    }
}
