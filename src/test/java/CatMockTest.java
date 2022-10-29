import com.example.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {
        @Mock
        private Feline feline;
        @Test
        public void testCatGetFood() throws Exception {
                Cat cat = new Cat(feline);
                List<String> expectedCatFoodList = List.of("Животные", "Птицы", "Рыба");
                Mockito.when(feline.eatMeat()).thenReturn(expectedCatFoodList);
                List<String> actualCatFoodList = cat.getFood();
                assertEquals(expectedCatFoodList, actualCatFoodList);
        }
}
