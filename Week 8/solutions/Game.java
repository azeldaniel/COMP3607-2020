public abstract class Game {
    protected int score;

    public void initialize() {
        System.out.println("Welcome to the Game");
    }

    public void startPlay() {
        score = 0;
    }

    public void endPlay() {
        System.out.println("Thanks for playing");
    }

    public int getScore() {
        return score;
    }

    // Strategy pattern
    public abstract void play();

    // Template method
    public final void playGame() {
        initialize();
        startPlay();
        play();
        endPlay();
    }

}