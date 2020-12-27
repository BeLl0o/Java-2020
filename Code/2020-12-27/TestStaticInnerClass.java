class Other1{
    private static String name = "Other";
    private static int count;
    static class Inner{
        public static String name = "Other.Inner";
        public void say(){
            System.out.println(Other1.name);
            System.out.println(":" + count);
        }
    }

}
public class TestStaticInnerClass {
    public static void main(String[] args){
 
        String str = Other1.Inner.name;
        System.out.println(str);

        Other1.Inner obj = new Other1.Inner();
        obj.say();
    }
}
