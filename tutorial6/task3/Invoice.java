package tutorial6.task3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Invoice implements IPayable {
    
    // attributes
    private int itemQuantity;
    private BigDecimal itemCost;

    protected static RoundingMode ROUNDING_MODE = RoundingMode.HALF_EVEN;
    
    //constructors
    public Invoice(int itemQuantity, BigDecimal itemCost) {
        setItemQuantity(itemQuantity);
        setItemCost(itemCost);
    }
    
    // methods
    // getters/setters
    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public BigDecimal getItemCost() {
        return itemCost;
    }

    public void setItemCost(BigDecimal itemCost) {
        this.itemCost = itemCost;
    }

    // functions
    public BigDecimal calculateInvoiceTotal() {
        return getItemCost().multiply(BigDecimal.valueOf((double)itemQuantity));
    }

    private BigDecimal rounded(BigDecimal number) {
        return number.setScale(2, ROUNDING_MODE);
    }

    @Override
    public BigDecimal calculatePayment() {
        return rounded(calculateInvoiceTotal());
    }    

}
