package yatzy.yatzyGameCategories.Impl.specialCategories;

import yatzy.yatzyGameCategories.famillyCategories.SpecialFamilyScoringStrategy;

import java.util.HashSet;
import java.util.List;

public class YatzyGameScoringStrategy extends SpecialFamilyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        return new HashSet<Integer>(dices).size() == 1 ? 50 : 0;
    }
}
