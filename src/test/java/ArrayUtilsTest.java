import org.example.ArrayUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayUtilsTest {
    @Before
    public ArrayUtils getArrayUtils() {
        ArrayUtils arrayUtils = new ArrayUtils();
        return arrayUtils;
    }

    @Test
    public void testTurnCurrentArray() {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[][] result = {{0, 1}, {1, 2}, {2, 3}, {3, 4}, {4, 5}};
        arrayUtils.setArraySize();
        int[][] expected = arrayUtils.turnCurrentArray();

        Assert.assertArrayEquals(result, expected);
    }

}
