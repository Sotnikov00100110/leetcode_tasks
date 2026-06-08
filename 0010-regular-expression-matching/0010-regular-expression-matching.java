import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Solution {
    public boolean isMatch(String s, String p) {
        String regS = s;
        String patternP = p;
        
        String regex = "^" + patternP + "$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}