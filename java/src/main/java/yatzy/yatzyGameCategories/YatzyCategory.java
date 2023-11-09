package yatzy.yatzyGameCategories;

import java.util.Random;

public enum YatzyCategory {
    CHANCE,
    YATZY,
    ONES,
    TWOS,
    THREES,
    FOURS,
    FIVES,
    SIXES,
    PAIR,
    TWO_PAIRS,
    THREE_OF_KIND,
    FOUR_OF_KIND,
    SMALL_STRAIGHT,
    LARGE_STRAIGHT,
    FULL_HOUSE;

    public static  YatzyCategory getRandomYatzyCategory() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
