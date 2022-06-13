import java.math.BigDecimal;

class TaxService {
    public void payOut(BigDecimal taxAmount) {
        System.out.println("в размере: " + taxAmount);
    }
}