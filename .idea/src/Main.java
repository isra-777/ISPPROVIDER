import java.io.*;
import java.util.*;

public class BillingSystem {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: BillingSystem <input file>");
            return;
        }

        String inputFilePath = args[0];
        String outputFilePath = "output.txt";

        try {
            List<Customer> customers = readCustomersFromFile(inputFilePath);
            List<Bill> bills = calculateBills(customers);
            sortBillsByAmount(bills);
            writeBillsToFile(bills, outputFilePath);
            printBillTotals(bills);
        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }

    private static List<Customer> readCustomersFromFile(String fileName) throws IOException {
        List<Customer> customers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");
                validateInputLine(parts, line);
                customers.add(createCustomerFromInput(parts));
            }
        }
        return customers;
    }

    private static void validateInputLine(String[] parts, String line) throws IOException {
        if (parts.length != 5) {
            throw new IOException("Invalid line format: " + line);
        }
    }

    private static Customer createCustomerFromInput(String[] parts) {
        String id = parts[0];
        int callMinutes = Integer.parseInt(parts[1]);
        int smsCount = Integer.parseInt(parts[2]);
        int internetMb = Integer.parseInt(parts[3]);
        TariffPlan plan = TariffPlan.valueOf(parts[4]);

        return new Customer(id, callMinutes, smsCount, internetMb, plan);
    }

    private static List<Bill> calculateBills(List<Customer> customers) {
        List<Bill> bills = new ArrayList<>();
        BillCalculator calculator = new BillCalculator();
        for (Customer customer : customers) {
            bills.add(calculator.calculateBill(customer));
        }
        return bills;
    }

    private static void sortBillsByAmount(List<Bill> bills) {
        bills.sort(Comparator.comparingDouble(Bill::getWithTaxAmount));
    }

    private static void writeBillsToFile(List<Bill> bills, String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Bill bill : bills) {
                writer.write(bill.toString());
                writer.newLine();
            }
        }
    }

    private static void printBillTotals(List<Bill> bills) {
        double totalPreTax = 0;
        double totalTax = 0;
        double totalWithTax = 0;
        for (Bill bill : bills) {
            totalPreTax += bill.getPreTaxAmount();
            totalTax += bill.getTax();
            totalWithTax += bill.getWithTaxAmount();
        }
        System.out.println("Total Pre-Tax: " + totalPreTax);
        System.out.println("Total Tax: " + totalTax);
        System.out.println("Total With Tax: " + totalWithTax);
    }
}
