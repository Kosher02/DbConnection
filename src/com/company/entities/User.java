package com.company.entities;

public class User {
    private int id;
    private String name;
    private String surname;
    private boolean gender;
    private String specialization;
    private int salary;

    public User() {

    }

    public User(String name, String surname, boolean gender, String specialization, int salary) {
        setName(name);
        setSurname(surname);
        setGender(gender);
        setSpecialization(specialization);
        setSalary(salary);
    }

    public User(int id, String name, String surname, boolean gender) {
        setId(id);
        setName(name);
        setSurname(surname);
        setGender(gender);
        setSpecialization(specialization);
        setSalary(salary);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getSpecialization(){return specialization;}

    public void setSpecialization(String specialization){this.specialization=specialization;}

    public int getSalary(){return salary;}

    public void setSalary(int salary){this.salary=salary;}


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + (gender ? "Male" : "Female") +
                ", specialization=" + specialization + '\'' +
                ", salary=" + salary +'\''+
                " }";
    }
}