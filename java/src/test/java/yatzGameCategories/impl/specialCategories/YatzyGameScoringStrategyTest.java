package yatzGameCategories.impl.specialCategories;

import org.junit.Test;
import yatzy.yatzyGameCategories.Impl.specialCategories.YatzyGameScoringStrategy;
import yatzy.Utils;

import static org.junit.Assert.assertEquals;

public class YatzyGameScoringStrategyTest {
    YatzyGameScoringStrategy yatzyGameScoringStrategy = new YatzyGameScoringStrategy();

    @Test
    public void test_scores_50_when_calculateScore_with_correct_dice_sets() {
        assertEquals(50,  yatzyGameScoringStrategy.calculateScore(Utils.getDices(4,4,4,4,4)));
        assertEquals(50, yatzyGameScoringStrategy.calculateScore(Utils.getDices(6,6,6,6,6)));
    }

    @Test
    public void test_scores_0_when_calculateScore_with_incorrect_dice_sets() {
        assertEquals(0,  yatzyGameScoringStrategy.calculateScore(Utils.getDices(6,6,6,6,3)));
        assertEquals(0, yatzyGameScoringStrategy.calculateScore(Utils.getDices(6,2,6,6,3)));
    }
}
