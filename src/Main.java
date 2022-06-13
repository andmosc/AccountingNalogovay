import Tax.*;
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму налогооблажения:");
        BigDecimal tax = new BigDecimal(scanner.next());

        Bill[] payments = new Bill[]{
                new Bill(tax, new IncomeTaxType(), new TaxService()),
                new Bill(tax, new VatTaxType(), new TaxService()),
                new Bill(tax, new ProgressiveTaxType(), new TaxService()),
        };

        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}