import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class test1{

    public static char firstNonRepeatedChar(String str) {
        // Edge case
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        // Count frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();

        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeated character
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // No non-repeated character
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = firstNonRepeatedChar(input);

        if (result == '\0') {
            System.out.println("No non-repeated character found.");
        } else {
            System.out.println("First non-repeated character: " + result);
        }

        sc.close();
    }
}
