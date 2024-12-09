package MunaiyaTammi;

public class Sponsorship {
    private int sponsorshipID;
    private String tier;
    private String type;
    private int amount;
    private String paymentInfo;

    public Sponsorship(int amount, String paymentInfo, int sponsorshipID, String tier, String type) {
        this.amount = amount;
        this.paymentInfo = paymentInfo;
        this.sponsorshipID = sponsorshipID;
        this.tier = tier;
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public int getSponsorshipID() {
        return sponsorshipID;
    }

    public void setSponsorshipID(int sponsorshipID) {
        this.sponsorshipID = sponsorshipID;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Sponsorship{" +
                "amount=" + amount +
                ", sponsorshipID=" + sponsorshipID +
                ", tier='" + tier + '\'' +
                ", type='" + type + '\'' +
                ", paymentInfo='" + paymentInfo + '\'' +
                '}';
    }
}
