/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jelly
 */
public class Attendance {
     private String EmployeeID;
     private String Name;
     private Boolean Status; 
     
     // Constructor
     public Attendance(String EmployeeID, String Name, Boolean Status){
         this.EmployeeID = EmployeeID;
         this. Name = Name;
         this.Status = Status;
     }

// Methods
    public String viewName() {
        return Name;
    }

    public int viewEmployee() {
        return Integer.parseInt(EmployeeID); // Assuming employeeID contains numeric values
    }

    public String keepRecords() {
        return "Employee ID: " + EmployeeID + ", Name: " + Name + ", Status: " + (Status ? "Present" : "Absent");
    }

    // Display method
    public void displayInfo() {
        System.out.println(keepRecords());
    }

    public static void main(String[] args) {
        Attendance att = new Attendance("1001", "John Doe", true);
        System.out.println(att.viewName());
        System.out.println(att.viewEmployee());
        att.displayInfo();
    }
}
   


