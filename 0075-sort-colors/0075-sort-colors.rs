impl Solution {
    pub fn sort_colors(nums: &mut Vec<i32>) {
        Self::quick_sort(nums);
    }

    fn quick_sort(arr: &mut [i32]) {
        let len = arr.len();
        if len <= 1 {
            return;
        }

        let pivot_index = Self::partition(arr);
        Self::quick_sort(&mut arr[0..pivot_index]);
        Self::quick_sort(&mut arr[pivot_index + 1..]);
    }

    fn partition(arr: &mut [i32]) -> usize {
        let len = arr.len();
        let pivot_index = len - 1;
        let mut i = 0;

        for j in 0..pivot_index {
            if arr[j] < arr[pivot_index] {
                arr.swap(i, j);
                i += 1;
            }
        }
    
        arr.swap(i, pivot_index);
        i
    }
}