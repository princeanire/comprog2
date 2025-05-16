public class Salary {
    String name;
    String employeeId;
    String basicSalary;
    int salary;
    String deductions;
    int netpay;

    public Salary(String name, String employeeId, String basicSalary, int salary, String deductions, int netPay) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.salary = salary;
        this.deductions = deductions;
        this.netpay = netPay;
    }

    public float calculateNetPay() {
        System.out.println("This will calculate net pay");
        return 0;
    }

    public float calculateDeductions() {
        System.out.println("This will calculate deductions pay");
        return 0;
    }

    public float calculateBenefits() {
        System.out.println("This will calculate deductions pay");
        return 0;
    }

    public float getNumberOfHoursWorked() {
        System.out.println("This will get the number of hours worked");
        return 0;
    }

    public float getHourlyRate() {
        System.out.println("This will get the hourly rate");
        return 0;
    }

}
