public class TestArray {
    public static void main (String args[]){
        int a[] = new int[10];
        int b = a.length;
        a[1] = 12;
        a[0] = 19;
        a[6] = 67;
        for(int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }
        System.out.println(b);
    }
}
