package tutorial6.task2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Employee {
    
    // attributes
    private String firstName;
    private String lastName;

    protected static RoundingMode ROUNDING_MODE = RoundingMode.HALF_EVEN;
    

    // constructors
    public Employee(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    // methods
    // getters/setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // functions
    public abstract BigDecimal calculateEarnings();

    @Override
    public String toString() {
        return "Employee: " + firstName + " " + lastName + "\tEarnings: $" + rounded(calculateEarnings());
    }

    private BigDecimal rounded(BigDecimal number) {
        return number.setScale(2, ROUNDING_MODE);
    }

}
