package com.ayu.ai_1.model;

import java.util.Objects;

public class Employee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaray() {
        return salaray;
    }

    public void setSalaray(int salaray) {
        this.salaray = salaray;
    }

    private int salaray;

    public Employee(int id, String name, int salaray) {
        this.id = id;
        this.name = name;
        this.salaray = salaray;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salaray == employee.salaray && Objects.equals(name, employee.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaray=" + salaray +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salaray);
    }
}
