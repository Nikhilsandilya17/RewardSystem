import model.*;

import java.time.LocalDate;

public class RewardFactory {

    public Reward createReward(RewardType type, int id, String description) {
        return switch (type) {
            case CASHBACK -> new CashbackReward(id, description, 0.0);
            case COUPON -> new CouponReward(id, description, "", LocalDate.now());
            case POINTS -> new PointsReward(id, description, 0);
            default -> throw new IllegalArgumentException("Invalid reward type");
        };
    }
}
