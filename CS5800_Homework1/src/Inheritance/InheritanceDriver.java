package Inheritance;

public class InheritanceDriver {
    public InheritanceDriver() {
        SalariedEmployee employee1 = new SalariedEmployee();
        HourlyEmployee employee2 = new HourlyEmployee();
        HourlyEmployee employee3 = new HourlyEmployee();
        CommissionEmployee employee4 = new CommissionEmployee();
        SalariedEmployee employee5 = new SalariedEmployee();
        BaseEmployee employee6 = new BaseEmployee();
        CommissionEmployee employee7 = new CommissionEmployee();

        employee1.setFirstName("Joe");
        employee1.setLastName("Jones");
        employee1.setSocialSecurityNumber("111-11-1111");
        employee1.setWeeklySalary(2500.0F);

        employee2.setFirstName("Stephanie");
        employee2.setLastName("Smith");
        employee2.setSocialSecurityNumber("222-22-2222");
        employee2.setHourlyWage(25.0F);
        employee2.setHoursWorked(32.0F);

        employee3.setFirstName("Mary");
        employee3.setLastName("Quinn");
        employee3.setSocialSecurityNumber("333-33-3333");
        employee3.setHourlyWage(19.0F);
        employee3.setHoursWorked(47.0F);

        employee4.setFirstName("Nicole");
        employee4.setLastName("Dior");
        employee4.setSocialSecurityNumber("444-44-4444");
        employee4.setCommissionRate(0.15F);
        employee4.setGrossSales(50000.0F);

        employee5.setFirstName("Renwa");
        employee5.setLastName("Chanel");
        employee5.setSocialSecurityNumber("555-55-5555");
        employee5.setWeeklySalary(1700.0F);

        employee6.setFirstName("Mike");
        employee6.setLastName("Davenport");
        employee6.setSocialSecurityNumber("666-66-6666");
        employee6.setBaseSalary(95000.0F);

        employee7.setFirstName("Mahnaz");
        employee7.setLastName("Vaziri");
        employee7.setSocialSecurityNumber("777-77-7777");
        employee7.setCommissionRate(0.22F);
        employee7.setGrossSales(40000.0F);

        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " " + employee1.getSocialSecurityNumber() + " " + employee1.getWeeklySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " " + employee2.getSocialSecurityNumber() + " " + employee2.getHourlyWage() + " " + employee2.getHoursWorked());
        System.out.println(employee3.getFirstName() + " " + employee3.getLastName() + " " + employee3.getSocialSecurityNumber() + " " + employee3.getHourlyWage() + " " + employee3.getHoursWorked());
        System.out.println(employee4.getFirstName() + " " + employee4.getLastName() + " " + employee4.getSocialSecurityNumber() + " " + employee4.getCommissionRate() + " " + employee4.getGrossSales());
        System.out.println(employee5.getFirstName() + " " + employee5.getLastName() + " " + employee5.getSocialSecurityNumber() + " " + employee5.getWeeklySalary());
        System.out.println(employee6.getFirstName() + " " + employee6.getLastName() + " " + employee6.getSocialSecurityNumber() + " " + employee6.getBaseSalary());
        System.out.println(employee7.getFirstName() + " " + employee7.getLastName() + " " + employee7.getSocialSecurityNumber() + " " + employee7.getCommissionRate() + " " + employee7.getGrossSales());
    }
}
