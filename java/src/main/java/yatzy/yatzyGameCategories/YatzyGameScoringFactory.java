package yatzy.yatzyGameCategories;

import yatzy.yatzyGameCategories.Impl.simpleCategories.*;
import yatzy.yatzyGameCategories.Impl.specialCategories.*;
import yatzy.yatzyGameCategories.Impl.upletFamilyCategories.FourOfKindScoringStrategy;
import yatzy.yatzyGameCategories.Impl.upletFamilyCategories.PairScoringStrategy;
import yatzy.yatzyGameCategories.Impl.upletFamilyCategories.ThreeOfKindScoringStrategy;
import yatzy.yatzyGameCategories.Impl.upletFamilyCategories.TwoPairsScoringStrategy;

public class YatzyGameScoringFactory {
    public static YatzyScoringStrategy getYatzyGame(YatzyCategory yatzyCategory) {
        YatzyScoringStrategy yatzyScoringStrategy = null;
        switch (yatzyCategory)  {
            case CHANCE:
                yatzyScoringStrategy = new ChanceScoringStrategy();
                break;
            case YATZY:
                yatzyScoringStrategy = new YatzyGameScoringStrategy();
                break;
            case ONES:
                yatzyScoringStrategy = new OnesScoringStrategy();
                break;
            case TWOS:
                yatzyScoringStrategy = new TwosScoringStrategy();
                break;
            case THREES:
                yatzyScoringStrategy = new ThreesScoringStrategy();
                break;
            case FOURS:
                yatzyScoringStrategy = new FoursScoringStrategy();
                break;
            case FIVES:
                yatzyScoringStrategy = new FivesScoringStrategy();
                break;
            case SIXES:
                yatzyScoringStrategy = new SixesScoringStrategy();
                break;
            case PAIR:
                yatzyScoringStrategy = new PairScoringStrategy();
                break;
            case TWO_PAIRS:
                yatzyScoringStrategy = new TwoPairsScoringStrategy();
                break;
            case THREE_OF_KIND:
                yatzyScoringStrategy = new ThreeOfKindScoringStrategy();
                break;
            case FOUR_OF_KIND:
                yatzyScoringStrategy = new FourOfKindScoringStrategy();
                break;
            case SMALL_STRAIGHT:
                yatzyScoringStrategy = new SmallStraightScoringStrategy();
                break;
            case LARGE_STRAIGHT:
                yatzyScoringStrategy = new LargeStraightScoringStrategy();
                break;
            case FULL_HOUSE:
                yatzyScoringStrategy = new FullHouseScoringStrategy();
                break;
            default:
                throw new IllegalArgumentException("There is a problem when retrieving YatzyGame Strategy " + yatzyCategory);
        }
        return yatzyScoringStrategy;
    }
}
