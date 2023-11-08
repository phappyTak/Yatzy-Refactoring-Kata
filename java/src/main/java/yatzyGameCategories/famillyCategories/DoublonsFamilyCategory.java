package yatzyGameCategories.famillyCategories;

import yatzyGameCategories.YatzyGameCategory;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class DoublonsFamilyCategory implements YatzyGameCategory {
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