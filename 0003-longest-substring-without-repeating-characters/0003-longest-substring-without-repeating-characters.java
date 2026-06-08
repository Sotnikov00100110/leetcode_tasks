class Solution {
    public static int lengthOfLongestSubstring(String s) {
    Set<Character> set = new HashSet<>();
    int left = 0, right = 0;
    int maxLength = 0;

    while (right < s.length()) {
        if (!set.contains(s.charAt(right))) {
            set.add(s.charAt(right++));
            maxLength = Math.max(maxLength, set.size());
        } else {
            set.remove(s.charAt(left++));
        }
    }

    return maxLength;
}

}