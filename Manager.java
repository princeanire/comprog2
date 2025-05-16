/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.employee;

/**
 *
 * @author jeffr
 */

public class Manager extends Employee {
    private String status;

    public Manager(String employeeId, String name, String department, int phoneNumber, String sex, String address) {
        super(employeeId, name, department, phoneNumber, sex, address);
        this.status = "Active"; // default status or you can add setter later
    }

    // Setters
    public void setName(String name) {
        super.setName(name);
    }

    public void setPhoneNumber(int phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Getter
    public String getStatus() {
        return status;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Status    : " + status);
    }
    
}

