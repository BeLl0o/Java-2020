class Other{
    private String name = "Other";
    private int count;
    class Inner{
        private String name = "Other.Innner";
        
        public void say(){
            System.out.println(Other.this.name);
            System.out.println(":" + count);
        }
    }
}

public class TestInnerClass {
    public static void main(String[] args){
        Other.Inner obj = new Other().new Inner();
        obj.say();
    }
}



