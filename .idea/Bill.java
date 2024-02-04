public class Bill {
    private double preTaxAmount;
    private double tax;
    private double withTaxAmount;

    public Bill(double preTaxAmount) {
        this.preTaxAmount = preTaxAmount;
        this.tax = calculateTax(preTaxAmount);
        this.withTaxAmount = preTaxAmount + tax;
    }

    private double calculateTax(double amount) {
        return amount < 2500 ? amount * 0.15 : amount * 0.20;
    }

    // Getters
    public double getPreTaxAmount() {
        return preTaxAmount;
    }

    public double getTax() {
        return tax;
    }

    public double getWithTaxAmount() {
        return withTaxAmount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "preTaxAmount=" + preTaxAmount +
                ", tax=" + tax +
                ", withTaxAmount=" + withTaxAmount +
                '}';
    }
}
