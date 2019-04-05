// Praca w parach: Damian Brzoskowski, Damian Eggert


// Class Declaration 

public class CezarHash
{ 
    // Instance Variables 
    String imie;
    String nazwisko;
  
    // Constructor Declaration of Class 
    public CezarHash(
        String imie, String nazwisko) 
    { 
        this.imie = imie; 
        this.nazwisko = nazwisko;
    } 
    
    private String hash_method() {
        char[] letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        String before_change = imie + " " + nazwisko;
        String after_change = "";
        int space = before_change.indexOf(" ");
        for(int i=0; i < before_change.length(); i++) {
            if (space == i) {
                after_change += " ";
            }
            for(int j=0; j<letters.length; j++) {
                if (before_change.charAt(i) == letters[j]) {
                   after_change += letters[j+1];
                }
            }
        }
          return after_change;
    }
        
  
    @Override
    public String toString() 
    { 
        return("Po zmianie: " + this.hash_method());
    } 
  
    public static void main(String[] args) 
    { 
        CezarHash ExampleName = new CezarHash("Damian", "Best");
        System.out.println(ExampleName.toString());
    } 
} 
