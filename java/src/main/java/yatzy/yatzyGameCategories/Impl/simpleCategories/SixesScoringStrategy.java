package yatzy.yatzyGameCategories.Impl.simpleCategories;

import yatzy.yatzyGameCategories.famillyCategories.SimpleFamilyScoringStrategy;

import java.util.List;

public class SixesScoringStrategy extends SimpleFamilyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        return scoreCalcultation(dices, 6);
    }
}

