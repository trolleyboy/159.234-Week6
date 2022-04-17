package tutorial6.task2;

import java.math.BigDecimal;

public class HourlyEmployee extends Employee {
    
    // attributes
    private BigDecimal wage;
    private double hours;
    
    // constructors
    public HourlyEmployee(String firstName, String lastName, BigDecimal wage, double hours) {
        super(firstName, lastName);
        setWage(wage);
        setHours(hours);
    }

    // methods
    // getters/setters
    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // functions
    @Override
    public BigDecimal calculateEarnings() {
        if (getHours() > 40) {
            BigDecimal first40Pay = getWage().multiply(BigDecimal.valueOf(40));
            double overtime = getHours() - 40;
            BigDecimal overtimeRate = getWage().multiply(BigDecimal.valueOf(1.5));
            BigDecimal overtimePay = overtimeRate.multiply(BigDecimal.valueOf(overtime));
            return first40Pay.add(overtimePay);
        } else {
            return getWage().multiply(BigDecimal.valueOf(getHours()));
        }
    }
}
