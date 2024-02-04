public class BillCalculator {

    public Bill calculateBill(Customer customer) {
        TariffPlan plan = customer.getPlan();
        double preTaxAmount;

        switch (plan) {
            case A:
                preTaxAmount = calculatePlanA(customer);
                break;
            case B:
                preTaxAmount = calculatePlanB(customer);
                break;
            case C:
                preTaxAmount = calculatePlanC(customer);
                break;
            case D:
                preTaxAmount = calculatePlanD(customer);
                break;
            case E:
                preTaxAmount = plan.getFixedMonthlyPrice(); // Fixed price for unlimited everything
                break;
            default:
                throw new IllegalArgumentException("Unknown Tariff Plan");
        }

        return new Bill(preTaxAmount);
    }

    private double calculatePlanA(Customer customer) {
        return customer.getCallMinutes() * 6 + // 6 Lek per call minute
                customer.getSmsCount() * 2 +    // 2 Lek per SMS
                customer.getInternetMb() * 3;   // 3 Lek per MB
    }

    private double calculatePlanB(Customer customer) {
        double total = 700; // Fixed price
        // Additional usage charges if customer exceeds the included amounts
        if (customer.getCallMinutes() > 200) {
            total += (customer.getCallMinutes() - 200) * 6;
        }
        if (customer.getSmsCount() > 200) {
            total += (customer.getSmsCount() - 200) * 2;
        }
        if (customer.getInternetMb() > 2000) {
            total += (customer.getInternetMb() - 2000) * 3;
        }
        return total;
    }

    private double calculatePlanC(Customer customer) {
        return 800 + // Fixed price for unlimited calls and SMS
                customer.getInternetMb() * 1.5; // 1.5 Lek per MB
    }

    private double calculatePlanD(Customer customer) {
        return 1000 + // Fixed price for unlimited internet
                customer.getCallMinutes() * 4 + // 4 Lek per call minute
                customer.getSmsCount() * 1.5;   // 1.5 Lek per SMS
    }
}
