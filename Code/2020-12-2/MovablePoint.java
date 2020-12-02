
public class MovablePoint implements Movable{
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;
    
    public MovablePoint(){}
    public MovablePoint(int x,int y, int xSpeed, int ySpeed ){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp(){
        y += ySpeed;
    }
    public void moveDown(){
        y -= ySpeed;
    }
    public void moveLeft(){
        x -= xSpeed;
    }
    public void moveRight(){
        x += xSpeed;
    }
}
