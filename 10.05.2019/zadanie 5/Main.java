// Praca w parach: Adrian Szostak, Damian Eggert

/*
2.7  Ex: The Customer and Invoice classes
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html#zz-2.7
*/
public class Main {

    public static void main(String[] args){
        Customer customer = new Customer(111,"Damian",20);

        Invoice invoice = new Invoice(222, customer,130);
        System.out.println(invoice);
    }
}
