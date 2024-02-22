package Class.SalaryCalculater;
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double raisedAmount;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.tax = 0;
        this.bonus = 0;
        this.raisedAmount = 0;
    }

    void calculateTax(){
        if (this.salary >= 1000){
            this.tax = this.salary * 0.03;
        }
    }

    void calculateBonus(){
        if (this.workHours > 40){
            this.bonus = (this.workHours - 40) * 30;
        }
    }

    void raiseSalary(){
        int workYears = 2021 - hireYear;
        if (workYears < 10){
            this.raisedAmount = this.salary * 0.05;
        } else if (workYears < 20) {
            this.raisedAmount = this.salary * 0.1;
        } else {
            this.raisedAmount = this.salary * 0.15;
        }
    }

    void printInfo(){
        System.out.printf("""
                        Adı : %s
                        Maaşı : %.2f
                        Çalışma Saati : %d
                        Başlangıç Yılı : %d
                        Vergi : %.2f
                        Bonus : %d
                        Maaş Artışı : %.2f
                        Vergi ve Bonuslar ile birlikte maaş : %.2f
                        Toplam Maaş : %.2f
                        """,
        this.name, this.salary, this.workHours, this.hireYear, this.tax, this.bonus, this.raisedAmount, (this.salary+this.bonus-this.tax), (this.salary+this.bonus-this.tax+this.raisedAmount));
    }
}

