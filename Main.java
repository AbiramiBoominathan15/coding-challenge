package com.salarycalculate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		  Employee emp = new Employee("John Doe", 30, "1234567890",
		  "123 Main St, Cityville", 50000, "Software Development");
		 Manager manager = new Manager("Jane Smith", 35, "0987654321",
		  "456 Oak Ave, Townburg", 80000, "Human Resources");
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.name);
        System.out.println("Age: " + emp.age);
        System.out.println("Phone Number: " + emp.phoneNumber);
        System.out.println("Address: " + emp.address);
        emp.printSalary(); 
        System.out.println("Specialization: " + emp.specialization);
        System.out.println();

        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        manager.printSalary(); 
        System.out.println("Department: " + manager.department);
    }
}