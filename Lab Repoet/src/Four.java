import java.util.Locale;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        String[] vowels = {"a", "e", "i", "o", "u"};
        int count = 0;
        Scanner scan = new Scanner(System.in);
        String character = scan.next();
        for (String i : vowels) {
            if (i == character.toLowerCase()) {
                count++;
            }
        }
        if (count > 0) {
            System.out.print(character + " is a Vowel.");
        } else {
            System.out.printf(character + " is a Consonant");
        }
    }
}
