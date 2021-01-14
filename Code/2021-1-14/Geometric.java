abstract class Geometric{
    boolean color, filled;

    public Geometric(){}
    public Geometric(boolean color,boolean filled){}

    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}