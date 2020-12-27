class Person{
    int count;
    public Person(){
        count++;
    }
}
class Person1{
    static int count;//static 修饰的变量（静态变量）属于整个类所有
    public Person1(){
        count++;
    }
}

public class TestInstance_StaticVariable{
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        Person1 p11 = new Person1();
        Person1 p12 = new Person1();
        Person1 p13 = new Person1();

        System.out.println(p3.count);
        System.out.println(p13.count);
    }
}