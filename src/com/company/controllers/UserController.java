package com.company.controllers;

import com.company.entities.User;
import com.company.repositories.interfaces.IUserRepository;

import java.util.List;

public class UserController {
    private final IUserRepository repo;

    public UserController(IUserRepository repo) {
        this.repo = repo;
    }

    public String createUser(String s, String name, String surname, String gender, String specialization, Integer salary) {
        boolean male = (gender.toLowerCase().equals("male"));
        User user = new User(name, surname, male, specialization, salary );

        boolean created = repo.createUser(user);

        return (created ? "Employee was created!" : "Employee creation was failed!");
    }

    public String getUser(int id) {
        User user = repo.getUser(id);

        return (user == null ? "Employee was not found!" : user.toString());
    }

    public String getAllEmployees() {
        List<User> users = repo.getAllEmployees();

        return users.toString();
    }

    public void createEmployee(String name, String surname, String gender, String specialization, String salary) {
    }
}