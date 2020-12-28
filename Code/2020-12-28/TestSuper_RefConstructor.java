class Parent2{
    String name = "Parent";

    public Parent2(String name){
        this.name = name;
    }
    public void say(){
        System.out.println("Father");
    }
}

class Child3 extends Parent2{
    public void say(){
//      String name = super.name;//调用父类的属性
        String name = this.name;
        super.say();//调用父类的成员方法
        System.out.println("Name:" + name);
    }
   
    public Child3(){
        super("son");//调用父类的构造方法
    }
    
}

public class TestSuper_RefConstructor{
    public static void main(String[] args){
        Child3 c = new Child3();
        c.say();
        
    }
}