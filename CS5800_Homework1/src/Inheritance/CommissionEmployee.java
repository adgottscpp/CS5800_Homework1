package Inheritance;

public class CommissionEmployee extends Employee {
    private Float commissionRate;
    private Float grossSales;

    public Float getCommissionRate() {
        return commissionRate;
    }
    public Float getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(Float newCommissionRate) {
        this.commissionRate = newCommissionRate;
    }
    public void setGrossSales(Float newGrossSales) {
        this.grossSales = newGrossSales;
    }
}
