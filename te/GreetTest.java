import org.junit.*;

public class GreetTest {
    @Test
    public void test() {

        int[] expectedArray = {100,200,300};
        int[] resultArray = {200,300,400};
        Assert.assertArrayEquals(expectedArray, resultArray); 

        Greet gre = new Greet();
        Assert.assertEquals("hello", gre.says());

        Assert.assertEquals(5, gre.min(5, 19));

        Assert.assertEquals(11 % 6, gre.modulo(11, 6));

        
    }
}
