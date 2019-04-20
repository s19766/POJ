// Praca w parach: Damian Brzoskowski, Damian Eggert


/*
1.Utwórz klasę Human reprezentującą człowieka, musi posiadać atrybuty takie jak wiek, waga, wzrost, imię i płeć, 
numer indeksu, rozmiar stopy. Klasa powinna także zawierać metody getAge, getWeight, getHeight, getName, isMale, 
getFeetSize, getIndexNumber. Stwórz także odpowiednie metody set. Stwórz przykładowy obiekt zwierający Twoje dane. 
*/


// Class Declaration   
public class Human { 

    // Instance Variables 
    String imie;
    int wiek;
    int waga;
    int wzrost;
    String plec;
    int numer_indexu;
    int rozmiar_stopy;
  
  
    // Constructor Declaration of Class 
    public Human (String imie, int wiek, int waga, int wzrost, String plec, int numer_indexu, int rozmiar_stopy) { 
    
        this.imie = imie; 
        this.wiek = wiek; 
        this.waga = waga; 
        this.wzrost = wzrost; 
        this.plec = plec; 
        this.numer_indexu = numer_indexu; 
        this.rozmiar_stopy = rozmiar_stopy; 
    } 
    
    private String getName() { 
        return imie; 
    } 
    
    private int getAge() { 
        return wiek; 
    } 
    
    private int getWeight() { 
        return waga; 
    } 
    
    private int getHeight() { 
        return wzrost; 
    } 
    
    private boolean isMale() { 
        if (plec == "Men") {
            return true;
        }
        else {
            return false;
        }
    } 

    private int getIndex() { 
        return numer_indexu; 
    } 
    
    private int getFeetSize() { 
        return rozmiar_stopy; 
    } 
  
  
    @Override
    public String toString() { 
    
        return("Hi my name is: "+ this.getName() + " age: " + this.getAge() +
        " weight: " + this.getWeight() + " height: " + this.getHeight() +
        " isMale: " + this.isMale() + " index: " + this.getIndex() + " feetSize: " + this.getFeetSize()); 
    } 
  
    public static void main(String[] args) { 
    
        Human Damian = new Human("Damian", 60, 70, 174, "Men", 423423423, 44); 
        System.out.println(Damian.toString()); 
        Human Damian2 = new Human("Damian", 52, 60, 182, "Men", 432443242, 47);
        System.out.println(Damian2.toString()); 
    } 
} 
