package yatzy.yatzyGameCategories;

import java.util.List;

public interface YatzyScoringStrategy {
    int calculateScore(List<Integer> dices);
}
