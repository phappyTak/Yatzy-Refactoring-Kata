package yatzGameCategories.impl.upletCategory;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.upletFamilyCategories.PairScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class PairScoringStrategyTest {
    PairScoringStrategy pairScoringStrategy = new PairScoringStrategy();

    @Test
    public void test_calculateScore_of_OnePairScoringStrategy() {
        assertEquals(6,  pairScoringStrategy.calculateScore(Utils.getDices(3,4,3,5,6)));
        assertEquals(10, pairScoringStrategy.calculateScore(Utils.getDices(5,3,3,3,5)));
        assertEquals(12, pairScoringStrategy.calculateScore(Utils.getDices(5,3,6,6,5)));
        assertEquals(0, pairScoringStrategy.calculateScore(Utils.getDices(1,3,6,2,5)));
    }
}
