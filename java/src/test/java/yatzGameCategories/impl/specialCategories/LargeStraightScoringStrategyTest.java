package yatzGameCategories.impl.specialCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.specialCategories.LargeStraightScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class LargeStraightScoringStrategyTest {
    LargeStraightScoringStrategy largeStraightScoringStrategy = new LargeStraightScoringStrategy();

    @Test
    public void test_calculateScore_of_LargeStraightScoringStrategy() {
        assertEquals(20,  largeStraightScoringStrategy.calculateScore(Utils.getDices(6,2,3,4,5)));
        assertEquals(20, largeStraightScoringStrategy.calculateScore(Utils.getDices(2,3,4,5,6)));
        assertEquals(0, largeStraightScoringStrategy.calculateScore(Utils.getDices(1,2,2,4,5)));
    }
}
