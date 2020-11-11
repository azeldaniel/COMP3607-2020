public class GuessingGame extends Game {

    private String[] animals;

    public GuessingGame() {
        animals = new String[3];
        animals[0] = "Dog";
        animals[1] = "Cat";
        animals[2] = "Bird";
    }

    public void initialize() {
        System.out.println("Welcome to the Guessing Game");
    }

    public void play() {
        String guess = "";
        for (int i = 0; i < 3; i++) {
            System.out.println("What animal am i thinking of?");
            java.util.Scanner screen = new java.util.Scanner(System.in);
            guess = screen.nextLine().trim();
            if (guess.equals(animals[i])) {
                score++;
                System.out.println("Yes!");
            } else {
                System.out.println("Nah!");
            }
        }
    }
}
