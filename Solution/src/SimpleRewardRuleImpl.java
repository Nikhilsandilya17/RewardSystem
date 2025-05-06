public class SimpleRewardRuleImpl extends AbstractRewardRule {
    public static final int MAX_ORDERS = 1;
    public static final double MAX_AMOUNT = 100;

    public SimpleRewardRuleImpl(RewardRule next) {
        super(next);
    }

    @Override
    public boolean isUserEligible(int numberOfOrders) {
        System.out.println("Checking simple reward rule");
        return numberOfOrders >= MAX_ORDERS && checkNextUserEligibility(numberOfOrders);
    }

    @Override
    public boolean isOrderEligible(double orderAmount) {
        System.out.println("Checking simple reward rule");
        return orderAmount >= MAX_AMOUNT && checkNextOrderEligibility(orderAmount);
    }
}
