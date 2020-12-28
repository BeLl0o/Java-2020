class Parent{
    String name;
    
    public Parent(){
        System.out.println("Parent()");
    }
    public Parent(String name){
        this.name = name;
        System.out.println("Parent(String name)");
    }
}

class Child extends Parent {
    public Child(){
        System.out.println("Child()");
    }
    public void say() {
        System.out.println("name"  + name);
    }
}

public class TestConstructorOrder {
    public static void main(String[] args){
        Child c = new Child();
    }
}
