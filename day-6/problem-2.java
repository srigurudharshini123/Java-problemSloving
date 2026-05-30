// Remove duplicate words into the given string
// input:Goodbye bye bye world world world
// output:Goodbye bye world
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            String[] words = input.split("\\s+");

            StringBuilder result = new StringBuilder();

            result.append(words[0]);

            for (int i = 1; i < words.length; i++) {
                if (!words[i].equalsIgnoreCase(words[i - 1])) {
                    result.append(" ").append(words[i]);
                }
            }

            System.out.println(result);
        }

        in.close();
    }
}
