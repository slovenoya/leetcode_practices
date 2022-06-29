package easy.sorting;
import java.util.Arrays;
public class valid_anagram {
  public boolean isAnagram(String s, String t) {
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    if (sArr.length != tArr.length) return false;
    Arrays.sort(sArr);
    Arrays.sort(tArr);
    for (int i = 0; i < sArr.length; i++) 
        if (sArr[i] != tArr[i]) 
            return false;
    return true;
}
}
