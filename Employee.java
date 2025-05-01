public class Employee {
    int empNo;
    String fullName;
    String hireDate;
    String status;
    double salary;
    double insurance;
    double overtime;
    double operational;
    double projectOrder;
    double tax;
    double totalSalary;

    public Employee(int empNo, String fullName, String hireDate, String status,
                    double salary, double insurance, double overtime,
                    double operational, double projectOrder, double tax) {
        this.empNo = empNo;
        this.fullName = fullName;
        this.hireDate = hireDate;
        this.status = status;
        this.salary = salary;
        this.insurance = insurance;
        this.overtime = overtime;
        this.operational = operational;
        this.projectOrder = projectOrder;
        this.tax = tax;
        this.totalSalary = calculateTotalSalary();
    }

    public double calculateTotalSalary() {
        return salary + overtime + operational + projectOrder - insurance - tax;
    }

    public void printSalarySlip() {
        System.out.printf("Employee: %s (%d)%n", fullName, empNo);
        System.out.printf("Total Salary: Rp%,.0f%n", totalSalary);
        System.out.println("--------------------------");
    }
}
