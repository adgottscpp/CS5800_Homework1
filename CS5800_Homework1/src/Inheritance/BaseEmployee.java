package Inheritance;

public class BaseEmployee extends Employee{
    private Float baseSalary;

    public Float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Float newBaseSalary) {
        this.baseSalary = newBaseSalary;
    }
}
