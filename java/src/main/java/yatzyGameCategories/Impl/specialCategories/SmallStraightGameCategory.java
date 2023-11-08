package yatzyGameCategories.Impl.specialCategories;

import yatzyGameCategories.YatzyGameCategory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmallStraightGameCategory implements YatzyGameCategory {
    @Override
    public int calculateScore(List<Integer> dices) {
        Set<Integer> unique_dice = new HashSet<Integer>(dices);
        return (unique_dice.size() == 5 && dices.contains(1) && unique_dice.contains(5)) ? 15 : 0;
    }
}
