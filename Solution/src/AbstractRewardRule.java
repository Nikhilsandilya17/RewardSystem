public abstract class AbstractRewardRule implements RewardRule {
    protected final RewardRule nextRewardRule;

    protected AbstractRewardRule(RewardRule nextRewardRule) {
        this.nextRewardRule = nextRewardRule;
    }

    protected boolean checkNextUserEligibility(int numberOfOrders, double orderAmount) {
        return nextRewardRule == null || nextRewardRule.isUserOrderEligible(numberOfOrders, orderAmount);
    }

}
