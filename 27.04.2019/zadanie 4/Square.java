// Praca: Damian Eggert

/*
4.5  Ex: Superclass Shape and its subclasses Circle, Rectangle and Square
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/
public class Square extends Rectangle {

    public Square(){
    }

    public Square(double side){
        super(side);
    }

    public Square(String color, boolean filled, double side){
        super(color, filled, side);
    }

    public double getSide(){
        return this.getWidth();
    }

    public void setSide(double side){
        this.setWidth(side);
        this.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
}
