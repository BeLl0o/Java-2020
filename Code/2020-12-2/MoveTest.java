public class MoveTest {
    public static void main(String args[]){
        MovablePoint test = new MovablePoint(0, 0, 1, 1); 
        MovableCircle test_circle = new MovableCircle(3, test);
        
        //test.moveDown();
        //test.moveRight();
        //System.out.println(test.x);
        //System.out.println(test.y);
        test_circle.moveDown();
        test_circle.moveRight();
        System.out.println(test_circle.center.x);
        System.out.println(test_circle.center.y);



    }
}
