package yatzy.yatzyGameCategories.Impl.upletFamilyCategories;

import yatzy.yatzyGameCategories.famillyCategories.UpletFamilyScoringStrategy;

import java.util.List;

public class ThreeOfKindScoringStrategy extends UpletFamilyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        List<Integer> allTriplets = getDuplicatesList(dices, 3);
        return allTriplets.isEmpty() ? 0 : allTriplets.stream().mapToInt(i->i).sum();
    }
}
