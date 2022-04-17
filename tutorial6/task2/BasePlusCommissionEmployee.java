package tutorial6.task2;

import java.math.BigDecimal;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    
    // attributes
    private BigDecimal baseSalary;

    // constructors
    public BasePlusCommissionEmployee(String firstName, String lastName, BigDecimal sales, BigDecimal baseSalary) {
        super(firstName, lastName, sales);
        setBaseSalary(baseSalary);
    }
    
    // methods
    // getters/setters
    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    // functions
    @Override
    public BigDecimal calculateEarnings() {
        BigDecimal baseSalaryWeekly = getBaseSalary().divide(BigDecimal.valueOf(52), ROUNDING_MODE);
        return super.calculateEarnings().add(baseSalaryWeekly);
    }
}
