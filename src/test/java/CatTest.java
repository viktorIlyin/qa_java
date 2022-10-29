import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CatTest {
Feline feline;
    @Test
    public void testCatGetSound() {
        Cat cat = new Cat(feline);
        String actual = cat.getSound();
        String expected = "Мяу";
        assertEquals(actual, expected);
        }
}