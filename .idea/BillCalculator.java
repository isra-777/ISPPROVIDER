public class ExpenseCalculator {

    public Expense calculateExpenses(Person person) {
        SubscriptionPlan plan = person.getSubscriptionPlan();
        double preTaxAmount;

        switch (plan) {
            case BASIC:
                preTaxAmount = calculateBasicExpenses(person);
                break;
            case STANDARD:
                preTaxAmount = calculateStandardExpenses(person);
                break;
            case PREMIUM:
                preTaxAmount = calculatePremiumExpenses(person);
                break;
            default:
                throw new IllegalArgumentException("Unknown Subscription Plan");
        }

        return new Expense(preTaxAmount);
    }

    private double calculateBasicExpenses(Person person) {
        return person.getCallMinutes() * 5 +            // 5 Lek per call minute
               person.getTextMessages() * 1.5 +         // 1.5 Lek per text message
               person.getDataUsageMb() * 2.5;          // 2.5 Lek per MB
    }

    private double calculateStandardExpenses(Person person) {
        double total = 500;  // Fixed price
        // Additional charges if person exceeds the included amounts
        if (person.getCallMinutes() > 150) {
            total += (person.getCallMinutes() - 150) * 5;
        }
        if (person.getTextMessages() > 100) {
            total += (person.getTextMessages() - 100) * 1.5;
        }
        if (person.getDataUsageMb() > 1000) {
            total += (person.getDataUsageMb() - 1000) * 2.5;
        }
        return total;
    }

    private double calculatePremiumExpenses(Person person) {
        return 800 +                                     // Fixed price for premium plan
               person.getDataUsageMb() * 1.2;            // 1.2 Lek per MB
    }
}
