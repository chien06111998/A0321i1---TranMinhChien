package case_study_md2.task_1.controller;

import java.util.Random;
import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu-------");
        System.out.println("1. Employee Management.");
        System.out.println("2. Customer Management.");
        System.out.println("3. Facility Management.");
        System.out.println("4. Booking Managerment.");
        System.out.println("5. Promotion Management.");
        System.out.println("0. Exit.");
        System.out.println("--------------------------");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagerment();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 0:
                    System.exit(0);
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
    public static void employeeManagement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu 1-------");
        System.out.println("1. Display list employees.");
        System.out.println("2. Add new employee.");
        System.out.println("3. Edit employee.");
        System.out.println("4. Return main menu.");
        System.out.println("--------------------------");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Display list employees.");
                    break;
                case 2:
                    System.out.println("Add new employee.");
                    break;
                case 3:
                    System.out.println("Edit employee.");
                    break;
                case 4:
                    System.exit(4);
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
    public static void customerManagement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu 2-------");
        System.out.println("1. Display list customers.");
        System.out.println("2. Add new customer.");
        System.out.println("3. Edit customer.");
        System.out.println("4. Return main menu.");
        System.out.println("--------------------------");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Display list customers.");
                    break;
                case 2:
                    System.out.println("Add new customer.");
                    break;
                case 3:
                    System.out.println("Edit customer.");
                    break;
                case 4:
                    System.exit(4);
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
    public static void facilityManagement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu 3-------");
        System.out.println("1. Display list facility.");
        System.out.println("2. Add new facility.");
        System.out.println("3. Display list facility maintenance.");
        System.out.println("4. Return main menu.");
        System.out.println("--------------------------");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Display list facility.");
                    break;
                case 2:
                    System.out.println("Add new facility.");
                    break;
                case 3:
                    System.out.println("Display list facility maintenance.");
                    break;
                case 4:
                    System.exit(4);
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
    public static void bookingManagerment () {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu 4-------");
        System.out.println("1. Add new booking.");
        System.out.println("2. Display list booking.");
        System.out.println("3. Create new constracts.");
        System.out.println("4. Display list contracts.");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        System.out.println("--------------------------");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        while (choice != 6) {
            switch (choice) {
                case 1:
                    System.out.println("Add new booking.");
                    break;
                case 2:
                    System.out.println("Display list booking.");
                    break;
                case 3:
                    System.out.println("Create new constracts.");
                    break;
                case 4:
                    System.out.println("Display list contracts.");
                    break;
                case 5:
                    System.out.println("Edit contracts");
                    break;
                case 6:
                    System.exit(4);
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
    public static void promotionManagement () {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Menu 5-------");
        System.out.println("1. Display list customers use service.");
        System.out.println("2. Display list customers get voucher.");
        System.out.println("3. Return main menu.");
        System.out.println("--------------------------");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        while (choice != 3) {
            switch (choice) {
                case 1:
                    System.out.println("Display list customers use service.");
                    break;
                case 2:
                    System.out.println("Display list customers get voucher.");
                    break;
                case 3:
                    System.exit(3);
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }
    }
}
