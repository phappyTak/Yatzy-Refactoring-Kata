package yatzy.yatzyGameCategories.Impl.specialCategories;

import yatzy.yatzyGameCategories.famillyCategories.UpletFamilyScoringStrategy;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FullHouseScoringStrategy extends UpletFamilyScoringStrategy {
    @Override
    public int calculateScore(List<Integer> dices) {
        List<Integer> allDoublons = dices.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(element -> element.getValue()>=2)
            .map(element -> (int) (element.getKey() * element.getValue()))
            .collect(Collectors.toList());
        return allDoublons.size() == 2 ? allDoublons.stream().mapToInt(i->i).sum(): 0;
    }
}
