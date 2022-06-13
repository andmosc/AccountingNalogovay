package Tax;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_CEILING;

public class IncomeTaxType extends TaxType {

    private static final BigDecimal TAX = BigDecimal.valueOf(0.13);

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        BigDecimal t = (amount.multiply(TAX));
        BigDecimal bigDecimal = t.setScale(5, ROUND_CEILING);

        System.out.print("Подоходный налог 13%, ");
        return bigDecimal;
    }
}
