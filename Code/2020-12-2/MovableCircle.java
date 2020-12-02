public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;

    public MovableCircle(){}; 
    public MovableCircle(int radius, MovablePoint center){
        this.radius = radius;
        this.center = center;
    }
    public void moveUp(){
        center.y += center.ySpeed;
    }
    public void moveDown(){
        center.y -= center.ySpeed;
    }
    public void moveLeft(){
        center.x -= center.xSpeed;
    }
    public void moveRight(){
        center.x += center.xSpeed;
    }
}