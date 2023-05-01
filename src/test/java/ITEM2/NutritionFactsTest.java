package ITEM2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NutritionFactsTest {
    @Test
    public void testScenario1() {
        int servingSize_input = 240;
        int calories_input = 100;
        NutritionFacts nf = new NutritionFacts.Builder(servingSize_input, 8).calories(calories_input).sodium(35).carbohydrate(27).build();

        assertEquals(servingSize_input, nf.getServingSize(), "The servingSize_input should be "+servingSize_input);
        assertEquals(calories_input, nf.getCalories(), "The calories_input should be "+calories_input);

    }
}
