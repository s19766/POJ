//Damian Brzoskowski, Damian Eggert


/*
2. Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość.
Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.
*/


public class Prostokat {
    
    private int x, y;
    
    public Prostokat(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getPole() {
        int pole=x*y;
        return pole; //pole prostokata
    }
    
    public int getObwod() {
        int obwod=(2*x)+(2*y);
        return obwod; //obwod prostokata
    }
    
    public double getPrzekatna() {
        double d = Math.pow(x,2)+Math.pow(y,2); //dlugosc przekatnej prostokata
        double sqrt = Math.sqrt(d);
        return sqrt;
    }
    
    
    public static void main(String args[]) {
        Prostokat prostokat = new Prostokat(5, 10);
        
        System.out.println("Pole prostokata o wartosciach x, y rowna sie = " + prostokat.getPole());
        System.out.println("Obwod prostokata o wartosciach x, y rowna sie = " + prostokat.getObwod());
        System.out.println("Dlugosc przekatnej prostokata o wartosciach x, y to = " + prostokat.getPrzekatna());
    }
    
}
