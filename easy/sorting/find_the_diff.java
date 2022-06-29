package easy.sorting;
import java.util.Arrays;
public class find_the_diff {
  public char findTheDifference(String s, String t) {
    char[] sa = s.toCharArray();
    char[] st = t.toCharArray();
    Arrays.sort(sa);
    Arrays.sort(st);
    for (int i = 0; i < sa.length; i++) {
        if (sa[i] != st[i])
            return st[i];
    }
    return st[st.length-1];
}
}
