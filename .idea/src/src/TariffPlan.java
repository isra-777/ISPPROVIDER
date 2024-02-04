public enum TariffPlan {
    A(6, 2, 3, -1, -1, -1), // 6 Lek per call minute, 2 Lek per SMS, 3 Lek per MB
    B(6, 2, 3, 700, 200, 2000), // 700 Lek fixed for 200 call minutes, 200 SMSs, and 2000MB
    C(-1, -1, 1.5, 800, -1, -1), // 800 Lek for unlimited calls and SMS, 1.5 Lek per MB
    D(4, 1.5, -1, 1000, -1, -1), // 1000 Lek for unlimited internet, 4 Lek per call minute, 1.5 Lek per SMS
    E(-1, -1, -1, 1500, -1, -1); // 1500 Lek for unlimited everything

    private final double callRate;
    private final double smsRate;
    private final double internetRate;
    private final double fixedMonthlyPrice;
    private final int includedMinutes;
    private final int includedInternetMB;

    TariffPlan(double callRate, double smsRate, double internetRate,
               double fixedMonthlyPrice, int includedMinutes, int includedInternetMB) {
        this.callRate = callRate;
        this.smsRate = smsRate;
        this.internetRate = internetRate;
        this.fixedMonthlyPrice = fixedMonthlyPrice;
        this.includedMinutes = includedMinutes;
        this.includedInternetMB = includedInternetMB;
    }

    public double getCallRate() {
        return callRate;
    }

    public double getSmsRate() {
        return smsRate;
    }

    public double getInternetRate() {
        return internetRate;
    }

    public double getFixedMonthlyPrice() {
        return fixedMonthlyPrice;
    }

    public int getIncludedMinutes() {
        return includedMinutes;
    }

    public int getIncludedInternetMB() {
        return includedInternetMB;
    }
}
