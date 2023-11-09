package yatzGameCategories.impl.simpleCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.simpleCategories.SixesScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class SixesScoringStrategyTest {
    SixesScoringStrategy sixesScoringStrategy = new SixesScoringStrategy();

    @Test
    public void test_calculateScore_of_SixesScoringStrategy() {
        assertEquals(0,  sixesScoringStrategy.calculateScore(Utils.getDices(4,4,4,5,5)));
        assertEquals(6, sixesScoringStrategy.calculateScore(Utils.getDices(4,4,6,5,5)));
        assertEquals(18, sixesScoringStrategy.calculateScore(Utils.getDices(6,5,6,6,5)));
    }
}
