import model.User;

public interface RewardRule {
    boolean isUserEligible(int numberOfOrders);
    boolean isOrderEligible(double orderAmount);
}
