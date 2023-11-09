package yatzy.yatzyGameCategories.Impl.specialCategories;

import yatzy.yatzyGameCategories.YatzyScoringStrategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmallStraightScoringStrategy implements YatzyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        Set<Integer> unique_dice = new HashSet<Integer>(dices);
        return (unique_dice.size() == 5 && dices.contains(1) && unique_dice.contains(5)) ? 15 : 0;
    }
}

