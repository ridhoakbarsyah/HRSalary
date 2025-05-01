import java.util.ArrayList;
import java.util.List;

public class HRSalary {
    List<Employee> employees = new ArrayList<>();

    public void seedData() {
        employees.add(new Employee(100, "Anton", "2/4/2020", "Permanent", 20000000, 1200000, 500000, 0, 0, 200000));
        employees.add(new Employee(101, "Budi", "2/4/2021", "Permanent", 15000000, 1200000, 250000, 0, 0, 150000));
        employees.add(new Employee(102, "Charlie", "2/4/2022", "Contract", 15000000, 300000, 225000, 0, 0, 150000));
        employees.add(new Employee(103, "Dian", "2/4/2023", "Contract", 10000000, 200000, 270000, 0, 0, 100000));
        employees.add(new Employee(104, "Gita", "2/4/2024", "Magang", 0, 0, 0, 1250000, 25000000, 625000));
    }

    public void printAllSalaries() {
        for (Employee e : employees) {
            e.printSalarySlip();
        }
    }

    public void printSummary() {
        System.out.println("=== Summary ===");
        System.out.println("Total Employees: " + employees.size());
        double total = 0;
        for (Employee e : employees) {
            total += e.totalSalary;
        }
        System.out.printf("Total Payout: Rp%,.0f%n", total);
    }
}
