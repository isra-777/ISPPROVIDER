public class Purchase {
    private double subtotal;
    private double salesTax;
    private double totalAmount;

    public Purchase(double subtotal) {
        this.subtotal = subtotal;
        this.salesTax = calculateSalesTax(subtotal);
        this.totalAmount = subtotal + salesTax;
    }

    private double calculateSalesTax(double amount) {
        return amount < 2500 ? amount * 0.1 : amount * 0.15;
    }

    // Getters
    public double getSubtotal() {
        return subtotal;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "subtotal=" + subtotal +
                ", salesTax=" + salesTax +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
