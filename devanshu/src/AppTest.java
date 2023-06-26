import static org.junit.Assert.*;
import org.junit.Test;

public class AppTest {
    @Test
    public void testFind() {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = null;
        String str4 = str1;
        String str5 = str1;
        int val1 = 5;
        int val2 = 6;

        String[] expectedArray = { "one", "two", "three" };
        String[] resultantArray = { "one", "two", "three" };

        assertEquals(str1, str2);
        assertTrue(val1 > val2);
        assertFalse(val1 < val2);
        assertNotNull(str1);
        assertNull(str3);
    }
}
