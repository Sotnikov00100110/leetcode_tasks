class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        String s2 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s2 += String.valueOf(s.charAt(i));
        }
        if (s.equals(s2)) return true;
        else return false;
    }
}