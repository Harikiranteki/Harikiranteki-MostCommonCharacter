import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
         HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        char mostCommonChar = ' ';
        int maxCount = 0;
        
        for (char c : charCount.keySet()) {
            if (charCount.get(c) > maxCount) {
                mostCommonChar = c;
                maxCount = charCount.get(c);
            }
        }
        
        return mostCommonChar;
    }
}
