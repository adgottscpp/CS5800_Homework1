package Inheritance;

public class SalariedEmployee extends Employee {
    private Float weeklySalary;

    public Float getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(Float newWeeklySalary) {
        this.weeklySalary = newWeeklySalary;
    }
}
