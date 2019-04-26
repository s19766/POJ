// Praca w parach: Łukasz Rachwał, Damian Eggert


import java.lang.StringBuilder;

public class Palindrom {

    private String data;

    public Palindrom(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isPalindrome() {
        String remove_special_chars = this.data.replaceAll("[-+.^:,\\s+]", "");
        String lower_case = remove_special_chars.toLowerCase();
        String reversed = new StringBuilder(lower_case).reverse().toString();
        return lower_case.equals(reversed);
    }
    
    public static void main(String[] args) {
        Palindrom PalindromObj = new Palindrom("Atak kata");
        System.out.println(PalindromObj.isPalindrome());
        PalindromObj.setData("muzo, raz daj jad za rozum.");
        System.out.println(PalindromObj.isPalindrome());
        PalindromObj.setData("wódy żal dla żydów.");
        System.out.println(PalindromObj.isPalindrome());
    }
}
