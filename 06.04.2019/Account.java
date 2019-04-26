// Praca w parach: Łukasz Rachwał, Damian Eggert

/*
1.6  Ex: The Account Class
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/

public class Account {

    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    public int debit(int amount) {
        if(amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount) {
        if(amount <= balance) {
            balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id=" + id + " name=" + name + ", balance= " + balance + "]";
    }

    public static void main(String[] args) {
        Account account1 = new Account("19766", "Damian", 3000);
        Account account2 = new Account("19638", "Lukasz", 4000);
        System.out.println(account1.getID());
        System.out.println(account1.getName());
        System.out.println(account1.getBalance());
        account1.credit(1000);
        System.out.println(account1.getBalance());
        account1.debit(5000);
        account1.debit(200);
        account1.transferTo(account2, 111);
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println(account1.toString());
        System.out.println(account2.toString());
    }
}
