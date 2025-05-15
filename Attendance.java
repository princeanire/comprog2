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

    // Getter Methods
     public String getEmployeeID(){
         return EmployeeID; 
     }
   
     public String getName(){
         return Name;
     }
     
     public Boolean getStatus(){
         return Status;
     }
     
     // Setter methods
     public void setEnployeeID(String EmployeeID){
         this.EmployeeID = EmployeeID;
     }
     
     public void setName(String Name){
         this.Name = Name;
     }
     
     public void setStatus(Boolean Status){
         this.Status = Status;
     }
     
     //Display method
    public void displayInfo() {
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Name: " + Name);
        System.out.println("Status: " + (Status ? "Present" : "Absent"));
         
     }
}


