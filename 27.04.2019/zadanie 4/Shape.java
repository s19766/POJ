// Praca: Damian Eggert

/*
4.5  Ex: Superclass Shape and its subclasses Circle, Rectangle and Square
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/
public class Shape {

    private String color = "red";
    private boolean filled = true;

    public Shape(){
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return this.color;
    }
}
