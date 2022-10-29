
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
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

}

