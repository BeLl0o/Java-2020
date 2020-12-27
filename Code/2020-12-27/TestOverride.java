class Parent_{
    protected void say(){
        System.out.println("Father");
    }
}
class Child_ extends Parent_{
    public void say(){
        System.out.println("son");
    }
}


public class TestOverride {
    public static void main(String[] args){
        Child_ c = new Child_();
        c.say();
    }    
}

