package tutorial6.task2;

import java.math.BigDecimal;

public class SalariedEmployee extends Employee {

    // attributes
    private BigDecimal salary;

    // constructors
    public SalariedEmployee(String firstName, String lastName, BigDecimal salary) {
        super(firstName, lastName);
        setSalary(salary);
    }

    // methods
    // getters/setters
    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    // functions
    @Override
    public BigDecimal calculateEarnings() {
        return getSalary().divide(BigDecimal.valueOf(52.00), ROUNDING_MODE);
    }
    
}
