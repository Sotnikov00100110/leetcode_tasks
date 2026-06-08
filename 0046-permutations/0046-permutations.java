class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> inputList = new ArrayList<>();

    for (int num : nums) {
        inputList.add(num);
    }

    permuteHelper(inputList, 0, result);

    return result;
}

private void permuteHelper(List<Integer> nums, int currentIndex, List<List<Integer>> result) {
    if (currentIndex == nums.size()) {
        result.add(new ArrayList<>(nums));
        return;
    }

    for (int i = currentIndex; i < nums.size(); i++) {
        Collections.swap(nums, currentIndex, i);
        permuteHelper(nums, currentIndex + 1, result);
        Collections.swap(nums, currentIndex, i); 
    }
}
}