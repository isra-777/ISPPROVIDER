public class Customer { private String id;
    private int callMinutes;
    private int smsCount;
    private int internetMb;
    private TariffPlan plan;

    public Customer(String id, int callMinutes, int smsCount, int internetMb, TariffPlan plan) {
        this.id = id;
        this.callMinutes = callMinutes;
        this.smsCount = smsCount;
        this.internetMb = internetMb;
        this.plan = plan;
    }

    // Getters
    public String getId() {
        return id;
    }

    public int getCallMinutes() {
        return callMinutes;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public int getInternetMb() {
        return internetMb;
    }

    public TariffPlan getPlan() {
        return plan;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setCallMinutes(int callMinutes) {
        this.callMinutes = callMinutes;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    public void setInternetMb(int internetMb) {
        this.internetMb = internetMb;
    }

    public void setPlan(TariffPlan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", callMinutes=" + callMinutes +
                ", smsCount=" + smsCount +
                ", internetMb=" + internetMb +
                ", plan=" + plan +
                '}';
    }
}
