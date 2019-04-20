// Praca w parach: Łukasz Rachwał, Damian Eggert

/*
1.4  Ex: The Employee Class
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/

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
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    //roczna pensja
    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary += (int)(salary*(percent/100.0f));
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[id = " + id + ", name = " + getName() + ", salary = " + salary + "]";
    }
    
    public static void main(String[] args) {
        Employee employee = new Employee(19766, 0, "Damian", "Eggert");
        System.out.println(employee.getID());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        employee.setSalary(5000);
        System.out.println(employee.getSalary());
        System.out.println(employee.getAnnualSalary());
        employee.raiseSalary(20);
        System.out.println(employee.getSalary());
    }
}
