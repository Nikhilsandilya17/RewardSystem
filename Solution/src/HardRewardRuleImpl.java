public class HardRewardRuleImpl extends AbstractRewardRule {
    public static final int MAX_ORDERS = 2;
    public static final double MAX_AMOUNT = 200;

    public HardRewardRuleImpl(RewardRule next) {
        super(next);
    }

    @Override
    public boolean isUserOrderEligible(int numberOfOrders, double orderAmount) {
        if(numberOfOrders>=MAX_ORDERS && orderAmount>=MAX_AMOUNT){
            System.out.println("User is eligible for HARD reward");
            return true;
        }
        return checkNextUserEligibility(numberOfOrders, orderAmount);
    }


}
