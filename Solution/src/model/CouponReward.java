package model;

import java.time.LocalDate;

public class CouponReward extends Reward {
    private String code;
    private LocalDate expiryDate;
    private RewardType rewardType;

    public CouponReward(int id, String description, String code, LocalDate expiryDate) {
        super(id, description);
        this.code = code;
        this.expiryDate = expiryDate;
        this.rewardType = RewardType.COUPON;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public RewardType getRewardType() {
        return rewardType;
    }

    public void setRewardType(RewardType rewardType) {
        this.rewardType = rewardType;
    }
}
