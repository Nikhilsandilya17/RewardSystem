public class HardRewardRuleImpl extends AbstractRewardRule {
    public static final int MAX_ORDERS = 2;
    public static final double MAX_AMOUNT = 200;

    public HardRewardRuleImpl(RewardRule next) {
        super(next);
    }

    @Override
    public boolean isUserEligible(int numberOfOrders) {
        System.out.println("Checking hard reward rule");
        return numberOfOrders >= MAX_ORDERS && checkNextUserEligibility(numberOfOrders);
    }

    @Override
    public boolean isOrderEligible(double orderAmount) {
        System.out.println("Checking hard reward rule");
        return orderAmount >= MAX_AMOUNT && checkNextOrderEligibility(orderAmount);
    }
}
