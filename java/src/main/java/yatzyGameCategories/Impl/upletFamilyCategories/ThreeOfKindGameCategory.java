package yatzyGameCategories.Impl.upletFamilyCategories;

import yatzyGameCategories.famillyCategories.UpletFamilyCategory;

import java.util.List;

public class ThreeOfKindGameCategory extends UpletFamilyCategory {
    @Override
    public int calculateScore(List<Integer> dices) {
        List<Integer> allTriplets = getDuplicatesList(dices, 3);
        return allTriplets.isEmpty() ? 0 : allTriplets.stream().mapToInt(i->i).sum();
    }
}
