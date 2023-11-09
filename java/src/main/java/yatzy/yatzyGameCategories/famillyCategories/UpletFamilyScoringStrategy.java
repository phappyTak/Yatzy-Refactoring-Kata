package yatzy.yatzyGameCategories.famillyCategories;

import yatzy.yatzyGameCategories.YatzyScoringStrategy;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class UpletFamilyScoringStrategy implements YatzyScoringStrategy {
    protected List<Integer> getDuplicatesList(List<Integer> dices, int occurences){
        return dices.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(element -> element.getValue()>=occurences)
            .map(element -> element.getKey() *  occurences)
            .collect(Collectors.toList());
    }
}
