public enum TariffPlan {
    A(5, 1.5, 2, -1, -1, -1), // 5 Lek per call minute, 1.5 Lek per SMS, 2 Lek per MB
    B(7, 2.5, 3, 600, 150, 1800), // 600 Lek fixed for 150 call minutes, 200 SMSs, and 1800MB
    C(-1, -1, 2, 900, -1, -1), // 900 Lek for unlimited calls, SMS, and 2 Lek per MB
    D(3.5, 1, -1, 1200, -1, -1), // 1200 Lek for unlimited internet, 3.5 Lek per call minute, 1 Lek per SMS
    E(-1, -1, -1, 1700, -1, -1); // 1700 Lek for unlimited everything

    private final double call_rate;
    private final double smsRate;
    private final double internet_Rate;
    private final double fixed_MonthlyPrice;
    private final int included_Minutes;
    private final int includedInternetMB;

    TariffPlan(double callRate, double smsRate, double internet_Rate,
               double fixed_MonthlyPrice, int includedMinutes, int includedInternetMB) {
        this.callRate = call_Rate;
        this.smsRate = smsRate;
        this.internetRate = internet_Rate;
        this.fixed_MonthlyPrice = fixed_MonthlyPrice;
        this.includedMinutes = includedMinutes;
        this.includedInternetMB = includedInternetMB;
    }

    public double getCall_Rate() {
        return call_Rate;
    }

    public double getSmsRate() {
        return smsRate;
    }

    public double getInternetRate() {
        return internetRate;
    }

    public double getFixed_MonthlyPrice() {
        return fixed_MonthlyPrice;
    }

    public int getIncludedMinutes() {
        return includedMinutes;
    }

    public int getIncludedInternetMB() {
        return includedInternetMB;
    }
}
