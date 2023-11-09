package yatzGameCategories.impl.upletCategory;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.upletFamilyCategories.ThreeOfKindScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class ThreeOfKindScoringStrategyTest {
    ThreeOfKindScoringStrategy threeOfKindScoringStrategy = new ThreeOfKindScoringStrategy();

    @Test
    public void test_calculateScore_of_ThreeOfKindScoringStrategy() {
        assertEquals(9,  threeOfKindScoringStrategy.calculateScore(Utils.getDices(3,3,3,4,5)));
        assertEquals(15, threeOfKindScoringStrategy.calculateScore(Utils.getDices(5,3,5,4,5)));
        assertEquals(9, threeOfKindScoringStrategy.calculateScore(Utils.getDices(3,3,3,3,5)));
        assertEquals(0, threeOfKindScoringStrategy.calculateScore(Utils.getDices(1,2,3,3,5)));
    }
}
