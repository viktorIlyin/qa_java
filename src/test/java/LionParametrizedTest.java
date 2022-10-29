import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
    public class LionParametrizedTest{
        private final String sex;
        private final boolean result;

    public LionParametrizedTest(String sex, boolean result) {
        this.sex = sex;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
Feline feline;
    @Test
    public void testLionHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean hasMane = lion.doesHaveMane();
        assertEquals("Самец или Самка", result, hasMane);
    }
}
