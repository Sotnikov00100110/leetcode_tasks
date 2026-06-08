class Solution {
   public List<String> letterCombinations(String digits) {
    List<String> listOfNumbers = new ArrayList<>();
    Map<Integer, String> mapNumbersListOfNumbers = new HashMap<>();
    
    mapNumbersListOfNumbers.put(2, "abc");
    mapNumbersListOfNumbers.put(3, "def");
    mapNumbersListOfNumbers.put(4, "ghi");
    mapNumbersListOfNumbers.put(5, "jkl");
    mapNumbersListOfNumbers.put(6, "mno");
    mapNumbersListOfNumbers.put(7, "pqrs");
    mapNumbersListOfNumbers.put(8, "tuv");
    mapNumbersListOfNumbers.put(9, "wxyz");
    
    if (!digits.isEmpty()) {
        String[] mapping = new String[digits.length()];
        for (int i = 0; i < digits.length(); i++) {
            mapping[i] = mapNumbersListOfNumbers.get(digits.charAt(i) - '0');
        }
        
        int[] indexes = new int[digits.length()];
        Arrays.fill(indexes, 0);
        
        while (true) {
            StringBuilder current = new StringBuilder();
            for (int i = 0; i < digits.length(); i++) {
                current.append(mapping[i].charAt(indexes[i]));
            }
            listOfNumbers.add(current.toString());
            
            int pointer = digits.length() - 1;
            while (pointer >= 0 && (indexes[pointer] + 1 >= mapping[pointer].length())) {
                pointer--;
            }
            
            if (pointer < 0) {
                break;
            }
            
            indexes[pointer]++;
            for (int i = pointer + 1; i < digits.length(); i++) {
                indexes[i] = 0;
            }
        }
    }
    
    return listOfNumbers;
}

}