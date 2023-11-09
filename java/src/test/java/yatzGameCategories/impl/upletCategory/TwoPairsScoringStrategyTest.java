package yatzGameCategories.impl.upletCategory;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.upletFamilyCategories.TwoPairsScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class TwoPairsScoringStrategyTest {
    TwoPairsScoringStrategy twoPairsScoringStrategy = new TwoPairsScoringStrategy();

    @Test
    public void test_calculateScore_of_TwoPairsScoringStrategy() {
        assertEquals(16,  twoPairsScoringStrategy.calculateScore(Utils.getDices(3,3,5,4,5)));
        assertEquals(16, twoPairsScoringStrategy.calculateScore(Utils.getDices(3,3,5,5,5)));
        assertEquals(16, twoPairsScoringStrategy.calculateScore(Utils.getDices(3,3,2,5,5)));
        assertEquals(0, twoPairsScoringStrategy.calculateScore(Utils.getDices(1,3,2,5,5)));
    }
}
