package tutorial6.task2;

import java.math.BigDecimal;

public class Payroll {
    
    public static void main(String[] args) {
        
        Employee[] employees = {
            new SalariedEmployee("Jimbo", "Jones", BigDecimal.valueOf(135000.00)),
            new CommissionEmployee("Peter", "Parker", BigDecimal.valueOf(2500.00)),
            new BasePlusCommissionEmployee("Tiny", "Tim", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(40000.00)),
            new HourlyEmployee("Mickey", "Mouse", BigDecimal.valueOf(25.00), 35.00),
            new HourlyEmployee("Minnie", "Mouse", BigDecimal.valueOf(26.00), 45.00)
        };

        for (Employee e : employees) {
            System.out.println(e);
        }

    }

}
