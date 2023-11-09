package yatzy.yatzyGameCategories.famillyCategories;

import yatzy.yatzyGameCategories.YatzyScoringStrategy;

import java.util.List;

public abstract class SimpleFamilyScoringStrategy implements YatzyScoringStrategy {
    protected int scoreCalcultation(List<Integer> dices, int gameNumber) {
        return dices.stream().filter(num -> num.equals(gameNumber)).mapToInt(i -> i).sum();
    }
}
