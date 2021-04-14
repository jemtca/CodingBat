
// given an array of ints, return the sum of the first 2 elements in the array
// if the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0
const sum2 = (nums) => {
    if (nums.length === 0) {
        return 0;
    } else if (nums.length === 1) {
        return nums[0];
    } else {
        return nums[0] + nums[1];
    }
};

console.log(sum2([1, 2, 3]));
console.log(sum2([1, 1]));
console.log(sum2([1, 1, 1, 1]));
