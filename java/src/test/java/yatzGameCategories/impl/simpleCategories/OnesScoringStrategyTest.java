package yatzGameCategories.impl.simpleCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.simpleCategories.OnesScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OnesScoringStrategyTest {
    OnesScoringStrategy onesScoringStrategy = new OnesScoringStrategy();

    @Test
    public void test_calculateScore_of_OnesScoringStrategy() {
        assertEquals(1,  onesScoringStrategy.calculateScore(Utils.getDices(1,2,3,4,5)));
        assertEquals(2, onesScoringStrategy.calculateScore(Utils.getDices(1,2,1,4,5)));
        assertEquals(0, onesScoringStrategy.calculateScore(Utils.getDices(6,2,2,4,5)));
        assertEquals(4, onesScoringStrategy.calculateScore(Utils.getDices(1,2,1,1,1)));
    }
}
