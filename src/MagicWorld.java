import java.util.HashMap;
import java.util.function.BinaryOperator;

public class MagicWorld {

    private static final String[] WORDS = {"IMPORTANT", "RECOGNITION", "STUDENT", "MAGICAL"};
    private String hiddenWord;
    private boolean[] guessedLetter;

    public MagicWorld() {
        int rand = (int) (Math.random() * WORDS.length);
        hiddenWord = WORDS[rand];
        guessedLetter = new boolean[hiddenWord.length()];
        for (int i = 0; i < guessedLetter.length; i++) {
            guessedLetter[i] = false;
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < hiddenWord.length(); i++) {
            if (guessedLetter[i]) {
                s += hiddenWord.charAt(i);
            } else {
                s += "_";
            }
        }
        return s;
    }

    public void shootLetter(String letterOrWord) {
        letterOrWord = letterOrWord.toUpperCase();
        String w = "";
        if (letterOrWord.length() == 1) {
            char letter = letterOrWord.charAt(0);
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == letter) {
                    guessedLetter[i] = true;
                }
            }
        } else {
            if (hiddenWord.equals(letterOrWord)) {
                for (int i = 0; i < hiddenWord.length(); i++) {
                    guessedLetter[i] = true;
                }
            }
        }
    }

    public boolean wins() {
        boolean win = false;
        int count = 0;
        for (int i = 0; i < guessedLetter.length; i++) {
            if (guessedLetter[i] == true) {
                count++;
            }
        }
        if (count == guessedLetter.length) {
            return true;
        }
        return win;
    }
}


