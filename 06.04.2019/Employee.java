import java.util.*;

public class Employee {

    private int id, salary;
    private String firstName, lastName;

    public Employee(int id, int salary, String firstName, String lastName){
        this.id = id;
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getID() {
        System.out.println("Podaj id uzytkownika: ");
        Scanner ID = new Scanner(System.in);
        id = ID.nextInt();
        return id;
    }

    public String getFirstName() {
        System.out.println("Podaj imie uzytkownika: ");
        Scanner FN = new Scanner(System.in);
        firstName = FN.next();
        return firstName;
    }

    public String getLastName() {
        System.out.println("Podaj nazwisko uzytkownika: ");
        Scanner LN = new Scanner(System.in);
        lastName = LN.next();
        return lastName;
    }

    public String getName() {
        String name = firstName + lastName;
        return name;
    }

    public int getSalary() {
        System.out.println("Podaj pensje uzytkownika: ");
        Scanner S = new Scanner(System.in);
        salary = S.nextInt();
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //roczna pensja
    public int getAnnualSalary() {
        salary = super(int salary) * 12;
        return salary;
    }

    public int raiseSalary(int percent) {
        percent = 2;
        salary = getAnnualSalary() * percent;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id = " + id + ", name = " + getName() + ", salary = " + raiseSalary(salary) + "]";
    }
    
    public static void main(String[] args) {
        Employee employee = new Employee(19766, 3000, "Damian", "Eggert");
        System.out.println(employee.getID());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getSalary());
        System.out.println(employee.toString());
    }
}
