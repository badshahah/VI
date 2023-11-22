
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import remind.Remind;
/**
 *
 * @author Adison
 */
public class Remind1 {
    
    public Remind1() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   @Test
    public void ValidReminder() {
        int A = 12;
        int B = 5;
        int expectedReminder = 2;

        int actualReminder = Remind.findRemind(A, B, expectedReminder);
        assertEquals(expectedReminder, actualReminder);
    }

    @Test
    public void ZeroReminder() {
        int A = 12;
        int B = 3;
        int expectedReminder = 0;

        int actualReminder = Remind.findRemind(A, B, expectedReminder);
        assertEquals(expectedReminder, actualReminder);
    }

    @Test
    public void NegativeDividend() {
        int A = -20;
        int B = 6;
        int expectedReminder = -2;

        int actualReminder = Remind.findRemind(A, B, expectedReminder);
        assertEquals(expectedReminder, actualReminder);
    }

    @Test
    public void ZeroDivisor() {
        int A = 9;
        int B = 0;
        int expectedReminder = -1;

        int actualReminder = Remind.findRemind(A, B, expectedReminder);
        assertEquals(expectedReminder, actualReminder);
    }

    @Test
    public void InvalidReminder() {
        int A = 11;
        int B = 3;
        int expectedReminder = 2;

        int actualReminder = Remind.findRemind(A, A, expectedReminder);
        assertEquals(-1, actualReminder);
    }
}