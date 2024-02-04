package com.example.task.model;

public class Employee {
    private Long psid;
    private String firstName;
    private String lastName;
    private String designation;
    private int age;
    private String location;

    public Employee() {
    }

    public Long getPsid() {
        return psid;
    }

    public void setPsid(Long psid) {
        this.psid = psid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }
    
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDesignation() {
        return designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "psid=" + psid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", designation='" + designation + '\'' +
                ", age=" + age +
                ", location='" + location + '\'' +
                '}';
    }
}
