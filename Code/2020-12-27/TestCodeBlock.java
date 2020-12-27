public class TestCodeBlock {
    public static void main(String[] args){
        {
            int x = 100;
            System.out.println("Normal Code Block x = " + x);
        }

        int x = 12;
        System.out.println("Out of Normal Code Block x = " + x);
    }
}
