public class SimpleRewardRuleImpl extends AbstractRewardRule {
    public static final int MAX_ORDERS = 1;
    public static final double MAX_AMOUNT = 100;

    public SimpleRewardRuleImpl(RewardRule next) {
        super(next);
    }

    @Override
    public boolean isUserOrderEligible(int numberOfOrders, double orderAmount) {
        if(numberOfOrders>=MAX_ORDERS && orderAmount>=MAX_AMOUNT){
            System.out.println("User is eligible for SIMPLE reward");
            return true;
        }
        return checkNextUserEligibility(numberOfOrders, orderAmount);
    }

}
