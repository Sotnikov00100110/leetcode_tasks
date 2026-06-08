class Solution {
    public String intToRoman(int num) {
        int[] decimalValues = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanNumerals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder romanNumeral = new StringBuilder();
        int i = 0;

        while (num > 0) {
            if (num >= decimalValues[i]) {
                romanNumeral.append(romanNumerals[i]);
                num -= decimalValues[i];
            } else {
                i++;
            }
        }

        return romanNumeral.toString();
    }
}