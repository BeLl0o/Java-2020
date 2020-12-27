class Person4{
    public Person4(){
        System.out.println("构造方法");
    }
    {
        System.out.println("构造代码块");
    }
    static{
        System.out.println("静态代码块");
    }
}

public class TestConstructorCodeBlock {
    public static void main(String[] args){
        new Person4();
        new Person4();
        new Person4();
    }
}
