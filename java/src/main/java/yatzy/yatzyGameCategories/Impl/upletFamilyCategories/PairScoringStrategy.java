package yatzy.yatzyGameCategories.Impl.upletFamilyCategories;

import yatzy.yatzyGameCategories.famillyCategories.UpletFamilyScoringStrategy;

import java.util.Collections;
import java.util.List;

public class PairScoringStrategy extends UpletFamilyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        List<Integer> allDoublons = getDuplicatesList(dices, 2);
        return allDoublons.isEmpty() ? 0 : Collections.max(allDoublons);
    }
}

