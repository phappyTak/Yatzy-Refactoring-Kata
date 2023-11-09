package yatzGameCategories.impl.specialCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.specialCategories.FullHouseScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class FullHouseScoringStrategyTest {
    FullHouseScoringStrategy fullHouseScoringStrategy = new FullHouseScoringStrategy();

    @Test
    public void test_calculateScore_of_FullHouseScoringStrategy() {
        assertEquals(18,  fullHouseScoringStrategy.calculateScore(Utils.getDices(6,2,2,2,6)));
        assertEquals(0, fullHouseScoringStrategy.calculateScore(Utils.getDices(2,3,4,5,6)));
    }
}
