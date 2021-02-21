package com.company;

import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.UserRepository;
import com.company.repositories.interfaces.IUserRepository;

public class Main {

    public static void main(String[] args) {
       String connectionUrl = "jdbc:postgresql://localhost:5432/assignment";
       IDB db = new PostgresDB();
        IUserRepository repo = new UserRepository(db);
        Employee app = new Employee(repo);
        app.start();
    }
}