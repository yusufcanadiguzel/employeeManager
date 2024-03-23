public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double taxAmount;
    double bonusAmount;
    double raiseAmount;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

        tax();
        bonus();
        raiseSalary();
    }

    void tax() {
        if (this.salary <= 1000) {
            this.taxAmount = 0;
        } else {
            this.taxAmount = this.salary * 0.03;
        }
    }

    void bonus() {
        if (this.workHours > 40) {
            int bonusHours = this.workHours - 40;
            this.bonusAmount = bonusHours * 30;
        } else {
            this.bonusAmount = 0.0;
        }
    }

    void raiseSalary() {
        var activeYears = 2021 - this.hireYear;

        if (activeYears < 10) {
            this.raiseAmount = this.salary * 0.05;
        } else if (activeYears < 20) {
            this.raiseAmount = this.salary * 0.1;
        } else {
            this.raiseAmount = this.salary * 0.15;
        }
    }

    public String toString() {
        System.out.println(STR."Adı: \{this.name}");
        System.out.println(STR."Maaşı: \{this.salary}");
        System.out.println(STR."Çalışma saati: \{this.workHours}");
        System.out.println(STR."Başlangıç Yılı: \{this.hireYear}");
        System.out.println(STR."Vergi: \{this.taxAmount}");
        System.out.println(STR."Bonus: \{this.bonusAmount}");
        System.out.println(STR."Maaş Artışı: \{this.raiseAmount}");
        System.out.println(STR."Vergi ve Bonuslar ile birlikte maaş: \{this.salary - this.taxAmount + this.bonusAmount}");
        System.out.println(STR."Toplam Maaş: \{this.salary + this.bonusAmount - this.taxAmount + this.raiseAmount}");
        return "";
    }
}
