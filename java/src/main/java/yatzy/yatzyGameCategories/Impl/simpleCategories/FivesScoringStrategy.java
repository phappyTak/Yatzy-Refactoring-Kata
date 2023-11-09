package yatzy.yatzyGameCategories.Impl.simpleCategories;

import yatzy.yatzyGameCategories.famillyCategories.SimpleFamilyScoringStrategy;

import java.util.List;

public class FivesScoringStrategy extends SimpleFamilyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        return scoreCalcultation(dices, 5);
    }
}
