package yatzGameCategories.impl.simpleCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.simpleCategories.TwosScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class TwoScoringStrategyTest {
    TwosScoringStrategy twosScoringStrategy = new TwosScoringStrategy();

    @Test
    public void test_calculateScore_of_TwosScoringStrategy() {
        assertEquals(4,  twosScoringStrategy.calculateScore(Utils.getDices(1,2,3,2,6)));
        assertEquals(10, twosScoringStrategy.calculateScore(Utils.getDices(2,2,2,2,2)));
    }
}
