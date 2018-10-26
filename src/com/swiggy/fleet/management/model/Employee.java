package com.swiggy.fleet.management.model;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by Aakarsh(aakarsh.gupta0@walmartlabs.com) on 13 Oct,2018.
 */
public class Employee {

    private String name;
    private Integer id;
    private Double salary;
    private int rating;
    private Postion postion;
    private City city;
    private Employee manager;
    private ArrayList<Employee>  subordinates;
    private Double bonous=0.0;

    public Employee(String name, Integer id, Double salary, int rating, Postion postion, City city, Employee manager, ArrayList<Employee> subordinates) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.rating = rating;
        this.postion = postion;
        this.city = city;
        this.manager = manager;
        this.subordinates = subordinates;
    }

    public void showDetails() {
        System.out.println("Name: " + getName() + ", id: " + getId() + ", Salary: " + getSalary() + ", rating: " + getRating() + ", Position: " + getPostion().getDescription() + ", City: " + getCity().getName());
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Double getSalary() {
        return salary;
    }

    public int getRating() {
        return rating;
    }

    public Postion getPostion() {
        return postion;
    }

    public City getCity() {
        return city;
    }

    public Employee getManager() {
        return manager;
    }

    public ArrayList<Employee> getSubordinates() {
        return subordinates;
    }

    public Double getBonous() {
        return bonous;
    }

    public void setBonous(Double bonous) {
        this.bonous = bonous;
    }

    public Double getBonousSalaryRatio() {
        return bonous/salary;
    }

}
