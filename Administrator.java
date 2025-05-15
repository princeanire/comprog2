package com.mycompany.employeeportalmotorph;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marsha
 */
public class Administrator {
    //attributes
    private String EmployeeID;
    private String Name;
    private String Department;
    private int Phonenumber;
    private String Sex;
    private String Address;
    
    //Constructor
    public Administrator(String EmployeeID, String Name, String deparment, int Phonenumber, String sex, String Address){
        this.EmployeeID = EmployeeID;
        this.Name = Name;
        this.Department = Department;
        this.Phonenumber = Phonenumber;
        this.Sex = Sex;
        this.Address = Address;        
    }
    
    // Getter Method
    public String getemployeeID(){ 
        return EmployeeID;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getDepartment(){
        return Department;
    }
    
    public int getPhonenumber(){
        return Phonenumber;
    }
    
    public String getsex(){
        return Sex;
    }
    
    public String getAddress(){
        return Address;
    }
    
    //setter methods
    public void setEmployeeID(String employeeID){
        this.EmployeeID = employeeID; 
    }
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    public void setDepartment(String Dpeartment){
        this.Department = Department;
    }
    
    public void setPhonenumber(int phonenumber){
        this.Phonenumber = Phonenumber;
    }
    
    public void setsex(String sex){
        this.Sex = Sex;
    }
    
    public void setAddress(String Address){
        this.Address = Address;
    }
    
    //Methods
    private Object generateEmployee(){
        System.out.println("Generate a new employee...");
        return new Object();
    }
    
    private boolean removeemploye(){
        System.out.println("removing an employee...");
        return true;
    } 
    
    private Object createAccount(){
        System.out.println("creating new account...");
        return new Object();
    }
    
    private boolean setStatus(){
        System.out.println("setting employee status...");
        return true;
    }
    
    private String modifyEmployee(){
        System.out.println("modifying employee details...");
        return "employee modified";
    }
    }
    


  