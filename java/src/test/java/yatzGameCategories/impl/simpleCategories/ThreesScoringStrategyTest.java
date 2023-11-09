package yatzGameCategories.impl.simpleCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.simpleCategories.ThreesScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class ThreesScoringStrategyTest {
    ThreesScoringStrategy threesScoringStrategy = new ThreesScoringStrategy();

    @Test
    public void test_calculateScore_of_ThreesScoringStrategy() {
        assertEquals(6,  threesScoringStrategy.calculateScore(Utils.getDices(1,2,3,2,3)));
        assertEquals(12, threesScoringStrategy.calculateScore(Utils.getDices(2,3,3,3,3)));
    }
}
