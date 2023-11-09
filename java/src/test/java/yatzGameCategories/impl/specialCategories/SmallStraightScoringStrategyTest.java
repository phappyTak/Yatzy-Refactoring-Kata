package yatzGameCategories.impl.specialCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.specialCategories.SmallStraightScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class SmallStraightScoringStrategyTest {
    SmallStraightScoringStrategy smallStraightScoringStrategy = new SmallStraightScoringStrategy();

    @Test
    public void test_calculateScore_of_SamllStraightScoringStrategy() {
        assertEquals(15,  smallStraightScoringStrategy.calculateScore(Utils.getDices(1,2,3,4,5)));
        assertEquals(15, smallStraightScoringStrategy.calculateScore(Utils.getDices(2,3,4,5,1)));
        assertEquals(0, smallStraightScoringStrategy.calculateScore(Utils.getDices(1,2,2,4,5)));
    }
}
