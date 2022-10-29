import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Spy
    private Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualLionGetKittens = lion.getKittens();
        int expectedLionGetKittens = 1;
        assertEquals(expectedLionGetKittens, actualLionGetKittens);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedLionFoodList = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedLionFoodList);
        List<String> actualLionFoodList = lion.getFood();
        assertEquals(expectedLionFoodList, actualLionFoodList);
    }
}
