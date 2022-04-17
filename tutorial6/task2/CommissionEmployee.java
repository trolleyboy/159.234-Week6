package tutorial6.task2;

import java.math.BigDecimal;

public class CommissionEmployee extends Employee {

    // attributes
    private static final double COMMISSION_RATE = 0.20;
    private BigDecimal grossSales;

    // constructors
    public CommissionEmployee(String firstName, String lastName, BigDecimal sales) {
        super(firstName, lastName);
        setGrossSales(sales);
    }
    
    // methods
    // getters/setters
    public static double getCommissionRate() {
        return COMMISSION_RATE;
    }

    public BigDecimal getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(BigDecimal grossSales) {
        this.grossSales = grossSales;
    }

    // functions
    @Override
    public BigDecimal calculateEarnings() {
        return getGrossSales().multiply(BigDecimal.valueOf(getCommissionRate()));
    }
    
}
