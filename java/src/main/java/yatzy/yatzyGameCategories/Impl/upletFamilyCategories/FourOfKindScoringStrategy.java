package yatzy.yatzyGameCategories.Impl.upletFamilyCategories;

import yatzy.yatzyGameCategories.famillyCategories.UpletFamilyScoringStrategy;

import java.util.List;

public class FourOfKindScoringStrategy extends UpletFamilyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        List<Integer> allQuadruplet = getDuplicatesList(dices, 4);
        return allQuadruplet.isEmpty() ? 0:  allQuadruplet.stream().mapToInt(i->i).sum();
    }
}

