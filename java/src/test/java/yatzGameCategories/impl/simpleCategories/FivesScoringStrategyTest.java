package yatzGameCategories.impl.simpleCategories;

import org.junit.Test;
import yatzy.Utils;
import yatzy.yatzyGameCategories.Impl.simpleCategories.FivesScoringStrategy;

import static org.junit.Assert.assertEquals;


public class FivesScoringStrategyTest {
    FivesScoringStrategy fivesScoringStrategy = new FivesScoringStrategy();

    @Test
    public void test_calculateScore_of_FivesScoringStrategy() {

        assertEquals(10,  fivesScoringStrategy.calculateScore(Utils.getDices(4,4,4,5,5)));
        assertEquals(15, fivesScoringStrategy.calculateScore(Utils.getDices(4,4,5,5,5)));
        assertEquals(20, fivesScoringStrategy.calculateScore(Utils.getDices(4,5,5,5,5)));
    }
}