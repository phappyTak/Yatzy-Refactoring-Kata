import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yatzy.yatzyGameCategories.YatzyCategory;
import yatzy.yatzyGameCategories.YatzyScoringStrategy;
import yatzy.yatzyGameCategories.YatzyGameScoringFactory;

import java.util.*;

public class YatzyGame {
    private static final Logger slf4jLogger = LoggerFactory.getLogger(YatzyGame.class);
    public static YatzyCategory yatzyCategory = YatzyCategory.getRandomYatzyCategory();
    YatzyScoringStrategy yatzyScoringStrategy =  YatzyGameScoringFactory.getYatzyGame(yatzyCategory);

    public int calculateScore(List<Integer> dices)
    {
        return yatzyScoringStrategy.calculateScore(dices);
    }


    public static void main (String[] args) {
        slf4jLogger.info("Start the Game");
        slf4jLogger.info("Yatzy Category {}", yatzyCategory);

        List<Integer> dices = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int randomNumber = new Random().nextInt(6 - 1) + 1;
            dices.add(randomNumber);
        }
        slf4jLogger.info("dices used for the game {}", dices);

        slf4jLogger.info("Score calculation ...");
        int score  = new YatzyGame().calculateScore(dices);
        slf4jLogger.info("Game Score {}", score);

    }
}



