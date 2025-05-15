/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author jeffr
 */
public class Employee {
  
    // 🔐 Private attributes
    private int employeeId;
    private String name;
    private String department;
    private String phoneNumber;
    private String sex;
    private String address;

    // 🏗️ Constructor
    public Employee(int employeeId, String name, String department, String phoneNumber, String sex, String address) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.sex = sex;
        this.address = address;
    }

    // ✅ Getters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getSex() { return sex; }
    public String getAddress() { return address; }

    // 🛠️ Setters
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }
    public void setName(String name) { this.name = name; }
    public void setDepartment(String department) { this.department = department; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setSex(String sex) { this.sex = sex; }
    public void setAddress(String address) { this.address = address; }

    // 📄 Display method
    public void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name      : " + name);
        System.out.println("Department: " + department);
        System.out.println("Phone No. : " + phoneNumber);
        System.out.println("Sex       : " + sex);
        System.out.println("Address   : " + address);
    }
}
