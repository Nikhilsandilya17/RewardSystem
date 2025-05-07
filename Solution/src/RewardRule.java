import model.User;

public interface RewardRule {
    boolean isUserOrderEligible(int numberOfOrders, double orderAmount);
}
