// Praca: Damian Eggert

/*
Write class to check if a number is Armstrong number or
not? (input 153 output true, 123 output false)
An Armstrong number of 3 digit is a number for which sum of
cube of its digits are equal to number e.g. 371 is an Armstrong
number because 3*3*3 + 7*7*7 + 1*1*1 = 371).

Source: http://www.java67.com/2013/01/10-programming-questions-and-exercises.html
*/
public class Main {
    public static void main(String[] args) {
        int number = 153;
        //int number = 123;

        int c = 0;
        int a;
        int Number;

        Number = number;
        while(number > 0){
            a = number % 10;
            number = number / 10;
            c = c + (a * a * a);
        }

        if(Number == c){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}
