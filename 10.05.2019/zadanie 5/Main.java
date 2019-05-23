public class Main {

    public static void main(String[] args){
        Customer customer = new Customer(111,"Damian",20);

        Invoice invoice = new Invoice(222, customer,130);
        System.out.println(invoice);
    }
}
