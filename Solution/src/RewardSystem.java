import model.Order;
import model.Reward;
import model.RewardType;
import model.User;

import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RewardSystem {
    private Map<User, List<Reward>> rewards = new HashMap<>();
    private Map<User, List<Order>> orders = new HashMap<>();
    private RewardRule rewardRule;
    private final RewardFactory rewardFactory = new RewardFactory();

    public RewardSystem() {
        rewards = new HashMap<>();
        orders = new HashMap<>();
    }

    public void giveRewards(User user, Order order) {
        System.out.println(order.toString());
        List<Order> updatedOrders = addOrderForUser(user, order);
        int numberOfOrders = updatedOrders.size();
        String userName = user.getName();
        
        if (isEligibleForReward(numberOfOrders, order.getAmount())) {
            System.out.println("User " + userName + " is eligible for rewards");
            addRewardForUser(user, userName);
        }
    }

    private void addRewardForUser(User user, String userName) {
        final String couponDescription = "This is Coupon reward";
        Reward coupon = rewardFactory.createReward(
                RewardType.COUPON, generateCouponId(), couponDescription);
        rewards.computeIfAbsent(user, k -> new ArrayList<>()).add(coupon);

        System.out.println("Reward added for user " + userName + " of type: " + RewardType.COUPON);
    }

    private int generateCouponId() {
        return new Random().nextInt(1000000 - 1) + 1;
    }

    private List<Order> addOrderForUser(User user, Order order) {
        List<Order> currentOrders = orders.computeIfAbsent(user, k -> new ArrayList<>());
        currentOrders.add(order);
        return currentOrders;
    }

    private boolean isEligibleForReward(int numberOfOrders, double orderAmount) {
        return rewardRule.isUserEligible(numberOfOrders)
                && rewardRule.isOrderEligible(orderAmount);
    }


    public void setRewardRule(RewardRule rewardRule) {
        this.rewardRule = rewardRule;
    }
}
