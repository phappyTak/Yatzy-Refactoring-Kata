package yatzGameCategories.impl.simpleCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.simpleCategories.FoursScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class FoursScoringStrategyTest {
    FoursScoringStrategy foursScoringStrategy = new FoursScoringStrategy();

    @Test
    public void test_calculateScore_of_FoursScoringStrategy() {
        assertEquals(12,  foursScoringStrategy.calculateScore(Utils.getDices(4,4,4,5,5)));
        assertEquals(8, foursScoringStrategy.calculateScore(Utils.getDices(4,4,5,5,5)));
        assertEquals(4, foursScoringStrategy.calculateScore(Utils.getDices(4,5,5,5,5)));
    }
}
