package yatzyGameCategories.Impl.upletFamilyCategories;

import yatzyGameCategories.famillyCategories.UpletFamilyCategory;

import java.util.Collections;
import java.util.List;

public class PairGameCategory extends UpletFamilyCategory {
    @Override
    public int calculateScore(List<Integer> dices) {
        List<Integer> allDoublons = getDuplicatesList(dices, 2);
        return allDoublons.isEmpty() ? 0 : Collections.max(allDoublons);
    }
}

