package tutorial6.task3;

import java.math.BigDecimal;

import tutorial6.task2.*;

public class Payments {
    
    public static void main(String[] args) {
        
        IPayable[] payments = {
            new SalariedEmployee("Jimbo", "Jones", BigDecimal.valueOf(135000.00)),
            new CommissionEmployee("Peter", "Parker", BigDecimal.valueOf(2500.00)),
            new BasePlusCommissionEmployee("Tiny", "Tim", BigDecimal.valueOf(2500.00), BigDecimal.valueOf(40000.00)),
            new HourlyEmployee("Mickey", "Mouse", BigDecimal.valueOf(25.00), 35.00),
            new HourlyEmployee("Minnie", "Mouse", BigDecimal.valueOf(26.00), 45.00),
            new Invoice(10, BigDecimal.valueOf(21.00)),
            new Invoice(8, BigDecimal.valueOf(2.00))
        };
    
        for (IPayable p : payments) {
            System.out.println("Paying: " + p.calculatePayment());
        }

    }

}
