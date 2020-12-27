class Parent{
    String name;
    double property;
    public void say(){
        System.out.println(name + "的财产" + property);
    }
}
class Child extends Parent{
    int age;
    public void sayAge(){
        System.out.println(name + "的年龄" + age);
    }
}
public class TestExtends {
    public static void main(String[] args){
        Child c = new Child();
        c.name = "zhang3";
        c.property = 250;
        c.age = 18;
        c.say();
        c.sayAge();
    }
    
}

