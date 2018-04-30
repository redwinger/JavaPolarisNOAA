package com.me;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Matt", "Bacher", "Hells Angels");
        Researcher researcher = new Researcher("Pat", "MotherFuckingJones", "Java");

        System.out.println(employee.firstName());
        System.out.println(employee.lastName());
        System.out.println(employee.organization());

        System.out.println(researcher.firstName());
        System.out.println(researcher.lastName());
        System.out.println(researcher.projects());
    }
}
