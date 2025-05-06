public abstract class AbstractRewardRule implements RewardRule {
    protected final RewardRule nextRewardRule;

    protected AbstractRewardRule(RewardRule nextRewardRule) {
        this.nextRewardRule = nextRewardRule;
    }

    protected boolean checkNextUserEligibility(int numberOfOrders) {
        return nextRewardRule == null || nextRewardRule.isUserEligible(numberOfOrders);
    }

    protected boolean checkNextOrderEligibility(double orderAmount) {
        return nextRewardRule == null || nextRewardRule.isOrderEligible(orderAmount);
    }
}
