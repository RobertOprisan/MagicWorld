import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        MagicWorld m = new MagicWorld();
        boolean gameOver = false;

        System.out.println(m);
        while (!gameOver) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter letter or word");
            String letter = input.next();
            m.shootLetter(letter);
            System.out.println(m);

            if (m.wins() == true) {
                gameOver = true;
                System.out.println("YOU WIN");
            }
        }

    }
}
