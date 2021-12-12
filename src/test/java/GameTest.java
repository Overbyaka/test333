import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GameTest {

    @Test
    public void checkIsWin() {
        char [][]array1 = {{'x', 'o', 'o'}, {'o', 'x', 'o'}, {'o', 'o', 'x'}};
        char [][]array2 = {{'o', 'o', 'x'}, {'o', 'x', 'o'}, {'x', 'o', 'o'}};
        char [][]array3 = {{'x', 'o', 'o'}, {'x', 'x', 'o'}, {'x', 'o', 'x'}};
        char [][]array4 = {{'.', '.', '.'}, {'.', 'x', '.'}, {'.', '.', '.'}};

        List<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(true);
        expected.add(true);
        expected.add(false);

        List<Boolean> actual = new ArrayList<>();
        actual.add(Game.checkIsWin(array1));
        actual.add(Game.checkIsWin(array2));
        actual.add(Game.checkIsWin(array3));
        actual.add(Game.checkIsWin(array4));

        Assert.assertEquals(expected, actual);
    }
}
