class Person3{
    private static int count;
    public Person3(){
        count++;
    }
    public static void say(){
        System.out.println("类实例化次数" + count);
    }
}
public class TestStaticFunction {
    public static void main(String[] args){
        Person3.say();//调用静态方法

        Person3 p1 = new Person3();
        Person3 p2 = new Person3();
        Person3.say(); //调用静态方法
        p1.say();
    }

}
