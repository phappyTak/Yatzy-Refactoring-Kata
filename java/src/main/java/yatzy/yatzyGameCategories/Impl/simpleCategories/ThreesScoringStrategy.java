package yatzy.yatzyGameCategories.Impl.simpleCategories;

import yatzy.yatzyGameCategories.famillyCategories.SimpleFamilyScoringStrategy;

import java.util.List;

public class ThreesScoringStrategy extends SimpleFamilyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        return scoreCalcultation(dices, 3);
    }
}

