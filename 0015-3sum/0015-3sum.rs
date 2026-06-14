impl Solution {
    pub fn three_sum(mut nums: Vec<i32>) -> Vec<Vec<i32>> {
        let mut vec: Vec<Vec<i32>> = Vec::new();
        if nums.len() < 3 {
            vec.push(vec![0,0,0]);
            return vec;
        }
        nums.sort();

        for i in 0..nums.len() - 1 {
            if i > 0 && nums[i] == nums[i-1] {
                continue;
            }
            let mut left: usize = i + 1;
            let mut right: usize = nums.len() - 1;

            while left < right {
                let res = nums[i] + nums[left] + nums[right];
                if res == 0 {
                    vec.push(vec![nums[i], nums[left], nums[right]]);

                    while left < right && nums[left] == nums[left + 1] {
                        left += 1;
                    }

                    while left < right && nums[right] == nums[right - 1] {
                        right -= 1;
                    }
                    left += 1;
                    right -= 1;
                } else if res < 0 {
                    left += 1;
                } else {
                    right -= 1;
                }
            }
        }
        vec
    }
}