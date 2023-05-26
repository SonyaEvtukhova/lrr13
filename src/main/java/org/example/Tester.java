package org.example;

public class Tester {


            private String name;
            private String surname;
            private int experienceInYears;
            private String englishLevel;
            private double salary;

            static double salary2;

            public Tester(String name, String surname) {
                this(name, surname, 2, "A1", 10.500);
            }

            public Tester(String name, String surname, int experienceInYears) {
                this(name, surname, experienceInYears, "С2", 12.500);
            }

            public Tester(String name, String surname, int experienceInYears, String englishLevel) {
                this(name, surname, experienceInYears, englishLevel, 14.500);
            }

            public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
                this.name = name;
                this.surname = surname;
                this.experienceInYears = experienceInYears;
                this.englishLevel = englishLevel;
                this.salary = salary;
            }

            public void printTesterInfo() {
                System.out.println("Name: " + name);
                System.out.println("Surname: " + surname);
                System.out.println("Experience in years: " + experienceInYears);
                System.out.println("English level: " + englishLevel);
                System.out.println("Salary: " + salary);
            }

            public void increaseSalary(double percentage) {
                salary = salary2 + (salary * percentage / 100);
            }
            public void increaseSalary(int percentage) {
                salary = salary + (salary * percentage / 100);
            }
            public void increaseSalary(double percentage, double salary) {
                salary = salary + (salary * percentage / 100);
            }
            public void increaseSalary() {
            }

            public String getFullName() {
                return name + " " + surname;
            }


            public int getExperienceInMonths() {
                return experienceInYears * 12;
            }

            public static void printHelloWorld() {
                System.out.println("Hello World!");
            }



        public static   void main(String[] args)
        {

            Tester tester1 = new Tester("Sonya", "Evtukhova");
            tester1.printTesterInfo();
            tester1.increaseSalary(10);
            System.out.println("New salary: " + tester1.salary);
            System.out.println("Full name: " + tester1.getFullName());
            System.out.println("Experience in months: " + tester1.getExperienceInMonths());
            System.out.println();
            Tester.printHelloWorld();
        }
    }
