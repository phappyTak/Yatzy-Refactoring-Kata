package yatzy.yatzyGameCategories.Impl.upletFamilyCategories;

import yatzy.yatzyGameCategories.famillyCategories.UpletFamilyScoringStrategy;

import java.util.List;

public class TwoPairsScoringStrategy extends UpletFamilyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        List<Integer> allDoublons = getDuplicatesList(dices, 2);
        return allDoublons.size() > 1 ? allDoublons.stream().mapToInt(i->i).sum() : 0;
    }
}

