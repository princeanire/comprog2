/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.employee;

/**
 *
 * @author jeffr
 */
public class Account {

    private String employeeID;
    private int dateOfBirth;  // You might want to use a Date type later for better date handling

    public Account(String employeeID, int dateOfBirth) {
        this.employeeID = employeeID;
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean employeeLogin(String enteredID, int enteredDOB) {
        // Simple login validation, you can improve it later
        return employeeID.equals(enteredID) && dateOfBirth == enteredDOB;
    }

    public void viewEmployeeDetails(Employee emp) {
        emp.displayInfo();
    }
    
}

   
