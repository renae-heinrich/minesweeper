import org.junit.Assert;
import org.junit.Test;

public class MinesweeperTest {
    @Test
    public void givenABoardWhenIPlaceTokenOnBombPlayerBlowsUp() {
        //arrange
        Game g = new Game();

        //act
        g.placeToken(0,1);
        boolean result = g.isGameOver();

        //assert

        Assert.assertEquals(true, result);


    }

    @Test
    public void whenPlayerPlacesTokenOnSafeSpaceGameContinues() {
        //arrange
        Game g = new Game(". .\n. .");

        //act
        g.placeToken(1,1);
        boolean result = g.isGameOver();
        g.getBoard();
        g.shoWBoard();

        Assert.assertEquals(false, result);
        Assert.assertEquals(". .\n. 0");
    }


}
