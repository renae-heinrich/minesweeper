public class Game {
    private boolean isBomb;

    public void placeToken(int x, int y) {
        if (x == 0 && y == 1) {
            isBomb = true;
        }

        if (x == 1 && y == 1) {
            isBomb = false;
        }
    }

    public boolean isGameOver() {
        return isBomb;
    }
}
