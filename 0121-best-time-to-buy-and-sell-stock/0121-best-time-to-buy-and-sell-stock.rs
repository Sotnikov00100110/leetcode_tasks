impl Solution {
    pub fn max_profit(prices: Vec<i32>) -> i32 {
        let (mut min_price, mut max_profit) = (i32::MAX, 0);

        for price in prices {
            if price < min_price {
                min_price = price;
            } else if price - min_price > max_profit {
                max_profit = price - min_price;
            }
        }
        
        max_profit
    }
}