package Class.SalaryCalculater;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kemal",2000,45,1985);
        employee.calculateBonus();
        employee.calculateTax();
        employee.raiseSalary();
        employee.printInfo();

    }

}
