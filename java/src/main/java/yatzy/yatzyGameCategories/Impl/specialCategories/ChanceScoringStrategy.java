package yatzy.yatzyGameCategories.Impl.specialCategories;

import yatzy.yatzyGameCategories.YatzyScoringStrategy;

import java.util.List;

public class ChanceScoringStrategy implements YatzyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        return dices.stream().mapToInt(i -> i).sum();
    }
}
