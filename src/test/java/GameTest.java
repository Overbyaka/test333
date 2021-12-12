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

    @Test
    public void checkIsCorrectIn() {
        char [][]array = {{'o', '.', '.'}, {'.', 'x', '.'}, {'.', '.', '.'}};

        int a1 = 0, b1 = 0;
        int a2 = 1, b2 = 1;
        int a3 = 2, b3 = 2;
        int a4 = 4, b4 = 0;

        List<Boolean> expected = new ArrayList<>();
        expected.add(false);
        expected.add(false);
        expected.add(true);
        expected.add(false);

        List<Boolean> actual = new ArrayList<>();
        actual.add(Game.checkIsCorrectIn(array, a1, b1));
        actual.add(Game.checkIsCorrectIn(array, a2, b2));
        actual.add(Game.checkIsCorrectIn(array, a3, b3));
        actual.add(Game.checkIsCorrectIn(array, a4, b4));

        Assert.assertEquals(expected, actual);
    }
}
