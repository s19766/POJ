// Praca: Damian Eggert

/*
4.5  Ex: Superclass Shape and its subclasses Circle, Rectangle and Square
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/
public class Circle extends  Shape {

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "area: " + this.getArea() + ", perimeter: " + this.getPerimeter();
    }
}
