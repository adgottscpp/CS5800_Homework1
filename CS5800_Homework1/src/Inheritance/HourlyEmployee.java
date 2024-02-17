package Inheritance;

public class HourlyEmployee extends Employee {
    private Float hoursWorked;
    private Float hourlyWage;

    public Float getHoursWorked() {
        return hoursWorked;
    }
    public Float getHourlyWage() {
        return hourlyWage;
    }

    public void setHoursWorked(Float newHoursWorked) {
        this.hoursWorked = newHoursWorked;
    }
    public void setHourlyWage(Float newHourlyWage) {
        this.hourlyWage = newHourlyWage;
    }
}
