package model;

public class CashbackReward extends Reward {

    private double amount;
    private RewardType rewardType;

    public CashbackReward(int id, String description, double amount) {
        super(id, description);
        this.amount = amount;
        this.rewardType = RewardType.CASHBACK;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public RewardType getRewardType() {
        return rewardType;
    }

    public void setRewardType(RewardType rewardType) {
        this.rewardType = rewardType;
    }
}
