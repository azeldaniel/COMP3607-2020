public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game mathGame = new GuessingGame();// new MathGame();
        mathGame.playGame();
        System.out.println("Your score was " + mathGame.getScore() + "/3");
    }

}
