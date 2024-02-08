public enum TariffPlan {
    A(5, 1.5, 2, -1, -1, -1), // 5 Lek per call minute, 1.5 Lek per SMS, 2 Lek per MB
    B(7, 2.5, 3, 600, 150, 1800), // 600 Lek fixed for 150 call minutes, 200 SMSs, and 1800MB
    C(-1, -1, 2, 900, -1, -1), // 900 Lek for unlimited calls, SMS, and 2 Lek per MB
    D(3.5, 1, -1, 1200, -1, -1), // 1200 Lek for unlimited internet, 3.5 Lek per call minute, 1 Lek per SMS
    E(-1, -1, -1, 1700, -1, -1); // 1700 Lek for unlimited everything

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
