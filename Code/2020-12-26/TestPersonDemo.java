//通过私有化属性和公有化属性访问器，就可以实现类的封装

class Person{
    private String name;
    private int age;

    /*
    public String getName(){
        return name;
    }
    public void setAge(int Age){
        if(0 < age && age < 200){
            age = Age;
        }
    }
    */
    public Person(){}
    public Person(String string){
        name = string;
    }
    public Person(String str, int n){
        name = str;
        age = n;
    }
    public void say(){
        System.out.println("Name:" + name +",Age" + age);
    }
}

public class TestPersonDemo{
    public static void main(String[] args){
        Person p1 = new Person();
        Person p2 = new Person();
        p1.say();
        p2.say();

    }
}