## Yatzy Game Refacto 

This java program is the result of my kata refotoring exercise, fork from the [repo](https://github.com/emilybache/Yatzy-Refactoring-Kata)

The aim was to refactor an application that implements Yatzy's game

The game of Yatzy is a simple dice game. Each player rolls five six-sided dice.
They can re-roll some or all of the dice up to three times (including the original roll) [more description here](https://sammancoaching.org/kata_descriptions/yatzy.html)

### Solution provided
To make the code more maintainable, I thought of dividing the Yatzy.java class into several smaller classes, each with a ***single responsibility***

- I decided to split all this up into different game categories so that the main class only had to call the right category ***(strategy) at runtime.***


- Categories having similarities in the code of resolution I thought of grouping them in family of categories in order to factorize the behavior which they have in common in a same class there is in particular the following families and categories
    - ***UpletFamilyCategory*** which will group together game categories where we need to retrieve a uplet of identical elements
      - FourOfKindGameCategory
      - ThreeOfKindGameCategory
      - PairGameCategory
      - TwoPairsGameCategory
    - ***SimpleFamilyCategory*** which groups categories where you just need to check that you have the right number among the dice values
      - OnesGameCategory
      - TwosGameCategory
      - ThreesGameCategory
      - FoursGameCategory
      - FivesGameCategory
      - SixesGameCategory
    - ***SpecialFamillyCategory*** groups together categories that have fairly specific rules
      - ChanceGameCategory
      - FullHouseGameCategory
      - LargeStraightGameCategory
      - SmallStraightGameCategory
      - YatzyGameCategory


- In addition I have an Enum ***YatzyCategoryEnum*** of all categories to have a strong typing


- Finally a factory that will call the right implementation depending on the enum

### go further
To improve the program, we could :
- Add a take spring framework, which will load dependency injection and simplify extensibility, managing the object lifecycle of our programme
- Use unit tests to test each category independently ...