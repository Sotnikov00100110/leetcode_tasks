use std::collections::HashMap;

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut hash_two: HashMap<i32, usize> = HashMap::new();

        for i in 0..nums.len() {
            let x = nums[i];
            let complement = target - x;

            if let Some(&index) = hash_two.get(&complement) {
                return vec![index as i32, i as i32];
            }
            hash_two.insert(x, i);
        }

        vec![]

    }
}