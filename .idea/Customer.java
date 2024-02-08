public class Client {
    private String identifier;
    private int minutesSpent;
    private int numberOfSMS;
    private int dataUsageMb;
    private TariffPlan selectedPlan;

    public Client(String identifier, int minutesSpent, int numberOfSMS, int dataUsageMb, TariffPlan selectedPlan) {
        this.identifier = identifier;
        this.minutesSpent = minutesSpent;
        this.numberOfSMS = numberOfSMS;
        this.dataUsageMb = dataUsageMb;
        this.selectedPlan = selectedPlan;
    }

    // Getters
    public String getIdentifier() {
        return identifier;
    }

    public int getMinutesSpent() {
        return minutesSpent;
    }

    public int getNumberOfSMS() {
        return numberOfSMS;
    }

    public int getDataUsageMb() {
        return dataUsageMb;
    }

    public TariffPlan getSelectedPlan() {
        return selectedPlan;
    }

    // Setters
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public void setMinutesSpent(int minutesSpent) {
        this.minutesSpent = minutesSpent;
    }

    public void setNumberOfSMS(int numberOfSMS) {
        this.numberOfSMS = numberOfSMS;
    }

    public void setDataUsageMb(int dataUsageMb) {
        this.dataUsageMb = dataUsageMb;
    }

    public void setSelectedPlan(TariffPlan selectedPlan) {
        this.selectedPlan = selectedPlan;
    }

    @Override
    public String toString() {
        return "Client{" +
                "identifier='" + identifier + '\'' +
                ", minutesSpent=" + minutesSpent +
                ", numberOfSMS=" + numberOfSMS +
                ", dataUsageMb=" + dataUsageMb +
                ", selectedPlan=" + selectedPlan +
                '}';
    }
}
