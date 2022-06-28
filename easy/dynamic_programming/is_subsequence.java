package easy.dynamic_programming;

public class is_subsequence {
  public boolean isSubsequence(String s, String t) {
    if (t.length() == 0 && s.length() != 0) return false;
    if (s.length() == 0) return true;
    if (s.length() > t.length()) return false;
    for (int i = 0; i < t.length(); i++) {
        if (t.charAt(i) == s.charAt(0)) {
            return isSubsequence(s.substring(1, s.length()), t.substring(i + 1, t.length()));
        }
    }
    return false;
  }
}
