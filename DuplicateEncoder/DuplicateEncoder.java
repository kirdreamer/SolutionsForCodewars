import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
  static String encode(String word){
        word = word.toLowerCase();
        Map<Character, Boolean> mapOfCharacters = new HashMap<>();
        for (int i = 0; i < word.length(); ++i) {
            if (mapOfCharacters.containsKey(word.charAt(i)))
                mapOfCharacters.put(word.charAt(i), true);
            else
                mapOfCharacters.put(word.charAt(i), false);
        }

        StringBuffer stringBuffer = new StringBuffer();
        
        for (int i = 0; i < word.length(); ++i) {
            if (mapOfCharacters.containsKey(word.charAt(i))) {
                if (mapOfCharacters.get(word.charAt(i))) {
                    stringBuffer.append(')');
                } else
                    stringBuffer.append('(');
            }
        }
        return stringBuffer.toString();
  }
}
