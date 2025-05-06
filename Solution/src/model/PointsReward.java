package model;

public class PointsReward extends Reward{
    private int points;
    private RewardType rewardType;
    public PointsReward(int id, String description, int points) {
        super(id, description);
        this.points = points;
        this.rewardType = RewardType.POINTS;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public RewardType getRewardType() {
        return rewardType;
    }

    public void setRewardType(RewardType rewardType) {
        this.rewardType = rewardType;
    }
}
