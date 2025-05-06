import model.Order;
import model.User;

public class RewardSystemDemo {
    public static void main(String[] args) {
        RewardRule rewardRule = new HardRewardRuleImpl(new SimpleRewardRuleImpl(null) );
        RewardSystem rewardSystem = new RewardSystem();
        rewardSystem.setRewardRule(rewardRule);
        User user = new User("Nikhil", "1234");
        Order order1 = new Order(1, 100);
        rewardSystem.giveRewards(user, order1);
        Order order2 = new Order(2, 300);
        rewardSystem.giveRewards(user, order2);
    }
}
