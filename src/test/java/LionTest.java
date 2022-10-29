
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class LionTest {
    Feline feline;
    @Test
    public void testHaveManeException() throws Exception {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("неизвестный", feline); });
        String expected = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    public void testLionGetFood() throws Exception{
        Lion lion = new Lion("Самец", feline);
        List<String> actualLionFoodList =  lion.getFood();
        List<String> expectedLionFoodList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedLionFoodList, actualLionFoodList);
    }

}

