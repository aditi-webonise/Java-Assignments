package com.assignment.springmaven.model;

public class Employee {
    private int id;
    private String name;
    private long contact;
    private String email;
    private String bloodGroup;

    /*
        Method for fetching employee's id
    */
    public int getId() {
        return id;
    }

    /*
        Method for fetching employee's name
    */
    public String getName() {
        return name;
    }

    /*
        Method for fetching employee's contact
    */
    public long getContact() {
        return contact;
    }

    /*
        Method for fetching employee's blood group
    */
    public String getBloodGroup() {
        return bloodGroup;
    }

    /*
        Method for fetching employee's email
    */
    public String getEmail(){
        return email;
    }

    /*
        Method for setting employee's id
    */
    public void setId(int id) {
        this.id = id;
    }

    /*
        Method for setting employee's name
    */
    public void setName(String name) {
        this.name = name;
    }

    /*
        Method for setting employee's contact
    */
    public void setContact(long contact) {
        this.contact = contact;
    }

    /*
        Method for setting employee's email
    */
    public void setEmail(String email) {
        this.email = email;
    }

    /*
        Method for setting employee's blood group
    */
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}