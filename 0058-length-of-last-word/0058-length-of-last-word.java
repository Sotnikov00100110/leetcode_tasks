class Solution {
    public int lengthOfLastWord(String s) {
        int iter = 0;
        String[] mas = s.split("\\s+");
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length - 1) {
                for (int j = 0; j < mas[i].length(); j++) iter++;
            }
        }
        return iter;
    }
}