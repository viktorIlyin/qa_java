import com.example.Animal;
import com.example.Cat;
import com.example.Feline;
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
            Mockito.when(cat.getFood()).thenReturn(Animal.getFood("Хищник"));
            List<String> actualCatFoodList = cat.getFood();
            List<String> expectedCatFoodList = List.of("Животные", "Птицы", "Рыба");
            assertEquals(expectedCatFoodList, actualCatFoodList);
        }
}
