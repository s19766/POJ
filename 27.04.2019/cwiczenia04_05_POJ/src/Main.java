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
