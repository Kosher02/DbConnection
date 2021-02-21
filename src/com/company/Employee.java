package com.company;

import com.company.controllers.UserController;
import com.company.repositories.interfaces.IUserRepository;

import java.util.Scanner;

public class Employee {
    private final UserController controller;
    private final Scanner scanner;
    private Object Menu;

    public Employee(IUserRepository userRepository) {
        controller = new UserController(userRepository);
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Welcome to My Application");
            System.out.println("Select option:");
            System.out.println("1. Get all employees");
            System.out.println("2. Create Employee");
            System.out.println("3. Create project");
            System.out.println("4. Total cost");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1-4): ");
                int option = scanner.nextInt();
                if (option == 1) {
                    getAllEmployeesMenu();
                } else if (option == 2) {
                    getUserByIdMenu();
                } else if (option == 3) {
                    createUserMenu();
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                scanner.next(); // to ignore incorrect input
            }

            System.out.println("*************************");

        }
    }

    public void getAllUsersMenu() {
        String response = controller.getAllEmployees();
        System.out.println(response);
    }

    public void getUserByIdMenu() {
        System.out.println("Please enter id");

        int id = scanner.nextInt();
        String response = controller.getUser(id);
        System.out.println(response);
    }

    public void createUserMenu() {
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        System.out.println("Please enter gender (male/female)");
        String gender = scanner.next();
        System.out.println("Please enter specialization ");
        String specialization = scanner.next();
        System.out.println("Please enter salary ");
        String salary = scanner.next();

        void response = controller.createEmployee(name, surname, gender, specialization, salary);
        System.out.println(response);
    }

    public Object getAllEmployeesMenu() {
        Object allEmployeesMenu;
        return allEmployeesMenu;
    }

    public void setAllEmployeesMenu(Object allEmployeesMenu) {
        this.getAllEmployeesMenu()Menu = allEmployeesMenu;
    }
}