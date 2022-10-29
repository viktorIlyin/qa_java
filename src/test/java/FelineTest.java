import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void testFelineGetFamily(){
        Feline feline = new Feline();
        String actualGetFamily = feline.getFamily();
        String expectedGetFamily = "Кошачьи";
        assertEquals("Результат не соответствует семье - Кошачьи", expectedGetFamily, actualGetFamily);

    }
    @Test
    public void testFelineGetKittens(){
        Feline feline = new Feline();
        int actualGetKittens = feline.getKittens();
        int expectedGetKittens = 1;
        assertEquals("Результат не соответствует количеству котят", expectedGetKittens, actualGetKittens);

    }
    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        List<String> actualFelineFoodList = feline.eatMeat();
        List<String> expectedFelineFoodList = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedFelineFoodList, actualFelineFoodList);
    }


}
