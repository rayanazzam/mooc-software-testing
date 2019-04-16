package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest
    @CsvSource({"xgx", "gxx", "xxg"})
    public void testForUnhappyG(String str) {
        Assertions.assertFalse(new GHappy().gHappy(str));
    }

    @ParameterizedTest
    @CsvSource({"xgg", "ggx","xggx","yggx"})
    public void testForHappyG(String str) {
        Assertions.assertTrue(new GHappy().gHappy(str));
    }

}
