// Praca: Damian Eggert

/*
4.2  Ex: Superclass Person and its subclasses
Source: http://www.ntu.edu.sg/home/ehchua/programming/java/J3f_OOPExercises.html
*/

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Damian", "Gdansk");
        System.out.println(person.getName());
        System.out.println(person.getAddress());
        person.setAddress("Sopot");
        System.out.println(person.getAddress());

        Staff staff = new Staff("Damian", "Gdansk", "PJATK", 4000);
        System.out.println(staff.getSchool());
        staff.setSchool("PG");
        System.out.println(staff.getSchool());
        System.out.println(staff.getPay());
        staff.setPay(6000);
        System.out.println(staff.getPay());

        Student student = new Student("Damian", "Gdansk", "Java", 2019, 650);
        System.out.println(student.getProgram());
        student.setProgram("Advance_Java");
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        student.setYear(2020);
        System.out.println(student.getYear());
        System.out.println(student.getFee());
        student.setFee(1000);
        System.out.println(student.getFee());
    }
}
