package Tax;

import java.math.BigDecimal;

import static java.math.BigDecimal.ROUND_CEILING;

public class ProgressiveTaxType extends TaxType {
    private static final BigDecimal TAX10 = BigDecimal.valueOf(0.10);
    private static final BigDecimal TAX15 = BigDecimal.valueOf(0.15);

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) {

        BigDecimal tt = BigDecimal.valueOf(100000);

        int i = amount.compareTo(tt);//сравнение

        BigDecimal t = (i == 1) ? amount.multiply(TAX15) : amount.multiply(TAX10);
        BigDecimal bigDecimal = t
                setScale(5, ROUND_CEILING);

        System.out.print("Прогрессивный налог, ");
        return bigDecimal;
    }
}
