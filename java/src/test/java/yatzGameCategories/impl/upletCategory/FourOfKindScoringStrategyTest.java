package yatzGameCategories.impl.upletCategory;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.upletFamilyCategories.FourOfKindScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class FourOfKindScoringStrategyTest {
    FourOfKindScoringStrategy fourOfKindScoringStrategy = new FourOfKindScoringStrategy();

    @Test
    public void test_calculateScore_of_FourOfKindScoringStrategy() {
        assertEquals(12,  fourOfKindScoringStrategy.calculateScore(Utils.getDices(3,3,3,3,5)));
        assertEquals(20, fourOfKindScoringStrategy.calculateScore(Utils.getDices(5,5,5,4,5)));
        assertEquals(12, fourOfKindScoringStrategy.calculateScore(Utils.getDices(3,3,3,3,3)));
        assertEquals(0, fourOfKindScoringStrategy.calculateScore(Utils.getDices(3,1,2,3,3)));
    }
}
