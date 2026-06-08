void swap(int *nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}

void reverse(int *nums, int left, int right) {
    while (left < right) {
        swap(nums, left, right);
        left++;
        right--;
    }
}

void nextPermutation(int* nums, int numsSize) {
    int n = numsSize;

    int i = n - 2;
    while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    }

    if (i >= 0) {
        int j = n - 1;
        while (j > i && nums[j] <= nums[i]) {
            j--;
        }
        swap(nums, i, j);
    }

    reverse(nums, i + 1, n - 1);
}