
// given an int array, return true if the array contains 2 twice, or 3 twice
// the array will be length 0, 1, or 2
const double23 = (nums) => {
    
    if (nums.length === 2) {
        if ((nums[0] === 2 && nums[1] === 2) || (nums[0] === 3 && nums[1] === 3)) {
            return true;
        }
    }
    
    return false;
};

console.log(double23([2, 2]));
console.log(double23([3, 3]));
console.log(double23([2, 3]));
