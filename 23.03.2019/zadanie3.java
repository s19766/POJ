//Damian Brzoskowski, Damian Eggert


/*
3. Stwórz klasę reprezentującą trójkąt, który musi posiadać atrybuty określające
długości boków. Klasa powinna posiadać metody: obliczające pole,
obwód, isEquilateral, isIsosceles, or isScalene.
*/


public class Trojkat {
    
    private int a, b, c;
    
    public Trojkat(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
     
    public double getPole() {
        double p; // polowa obwodu
        p = (a + b + c)/2;
        double pole;
        pole = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return pole; //pole trojkata
    }
    
    public int getObwod() {
        int obwod = a + b + c;
        return obwod; //obwod trojkata
    }
    
    public boolean isEquilateral() {
        return a == b && a == c; //metoda sprawdzenia - rownoboczny
    }
    
    public boolean isIsosceles() {
        return a==b && a+b>c || a==c && a+c>b || b==c && b+c>a; //metoda sprawdzenia - rownoramienny
    }
    
    public boolean isScalene() {
        return a != b && a != c && b != c; //metoda sprawdzenia - roznoboczny
    }

    
    public static void main(String args[]) {
        Trojkat trojkat = new Trojkat(4, 6, 7);
        System.out.println("Pole trojkata o dl. bokow a, b, c rowna sie = " + trojkat.getPole());
        System.out.println("Obwod trojkata o dl. bokow a, b, c rowna sie = " + trojkat.getObwod());
        System.out.println("Czy trojkat jest rownoboczny? " + trojkat.isEquilateral());
        System.out.println("Czy trojkat jest rownoramienny? " + trojkat.isIsosceles());
        System.out.println("Czy trojkat jest roznoboczny? " + trojkat.isScalene());
    }
    
}
