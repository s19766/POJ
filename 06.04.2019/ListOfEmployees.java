// Praca w parach: Łukasz Rachwał, Damian Eggert// Praca w parach: Łukasz Rachwał, Damian Eggert
package com.company;

import model.Employee;
import model.Date;

import java.util.ArrayList;


public class Main {

 public static void printEmplyees()
 {
        Employee employee1 = new Employee(0, "Jan", "Kowalski", 5000, new Date(11, 10, 2010));
        Employee employee2 = new Employee(1, "Jan", "Nowak", 6000, new Date(11, 10, 2010));
        Employee employee3 = new Employee(2, "Tomasz", "Nowicki", 8888, new Date(11, 10, 2010));
        Employee employee4 = new Employee(3, "Juliusz", "Slowacki", 92929, new Date(11, 10, 2010));
        Employee employee5 = new Employee(4, "Adam", "Mickiewicz", 242435, new Date(11, 10, 2010));
        Employee employee6 = new Employee(5, "Boleslaw", "Prus", 3235, new Date(11, 10, 2010));
        Employee employee7 = new Employee(6, "Adam", "Malysz", 3435, new Date(11, 10, 2010));
        Employee employee8 = new Employee(7, "Jerzy", "Engel", 5757, new Date(11, 10, 2010));

        ArrayList employeesList = new ArrayList<>();

        employeesList.add(employee1);
        employeesList.add(employee2);
        employeesList.add(employee3);
        employeesList.add(employee4);
        employeesList.add(employee5);
        employeesList.add(employee6);
        employeesList.add(employee7);
        employeesList.add(employee8);

        for (Object employee : employeesList) {
            System.out.println(employee);
        }
    }
}
