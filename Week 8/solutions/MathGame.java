public class MathGame extends Game {

    public void play() {
        int v1;
        int v2;
        int sol;
        int answer = 0;
        int numTries = 0;
        boolean solved = false;

        java.util.Random random = new java.util.Random();

        for (int i = 0; i < 3; i++) {
            v1 = random.nextInt(10);
            v2 = random.nextInt(10);
            sol = v1 + v2;
            System.out.println("What is the sum ?");// of " + v1 + " and  " + v2 + "

            solved = false;
            numTries = 0;
            while (numTries < 3 && !solved) {
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                answer = scanner.nextInt();
                numTries++;
                if (answer == sol) {
                    score++;
                    System.out.println("Yes!");
                    solved = true;
                } else {
                    if (numTries == 3) {
                        System.out.println("You didn't guess this question correctly");
                    } else {
                        System.out.println("Nah! Try again!");
                    }
                }
            }
        }
    }
}
