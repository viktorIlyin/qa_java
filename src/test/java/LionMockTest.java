
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    private Feline feline;

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(lion.getKittens()).thenReturn(1);
        int actualLionGetKittens = feline.getKittens();
        int expectedLionGetKittens = 1;
        assertEquals(expectedLionGetKittens, actualLionGetKittens);
    }

}
