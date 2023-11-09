package yatzGameCategories.impl.specialCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.specialCategories.ChanceScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class ChanceScoringStrategyTest {
    ChanceScoringStrategy chanceScoringStrategy = new ChanceScoringStrategy();

    @Test
    public void test_calculateScore_of_chance_scores_sum_of_all_dice() {
        assertEquals(15,  chanceScoringStrategy.calculateScore(Utils.getDices(2,3,4,5,1)));
        assertEquals(16, chanceScoringStrategy.calculateScore(Utils.getDices(3,3,4,5,1)));
    }
}
