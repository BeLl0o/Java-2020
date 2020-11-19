// Date: 2010-11-19
// Description: just a example to fully understand [static]
// Comiled: No
// Debugged: No
// Passed unit test: No
class MyObject{
    private static String str1 = "staticProperty";
    private String str2 = "property";

    public MyObject(){

    }
    public void print1(){
        System.out.println(str1);
        System.out.println(str2);
        print2();
    }

    public static void print2(){
        System.out.println(str1);
        System.out.println(str2);
        print2();
    }

}