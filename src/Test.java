import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        Bill[] payments = new Bill[]{
                new Bill(new BigDecimal("100000"), new VATaxType(), new TaxService()),
                new Bill(new BigDecimal("130000"), new ProgressiveTaxType(), new TaxService()),
                new Bill(new BigDecimal("70000"), new IncomeTaxType(), new TaxService())
        };
        for (Bill bill : payments) {
            bill.payTaxes();
        }
    }
}