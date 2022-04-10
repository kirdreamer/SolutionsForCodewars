public class StringSplit {
    public static String[] solution(String s) {
      int len = s.length();
      String[] newS = new String[len / 2 + len % 2];
      for (int i = 0; i < len - len % 2; i += 2) {
        newS[i / 2] = "" + s.charAt(i) + s.charAt(i + 1);
      }
      if (len % 2 == 1) {
        newS[len / 2] = s.charAt(len - 1) + "_";
      }
      return newS;
    }
}
