
// given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same
// every int must be in one group or the other
// write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray()
const splitArray = (nums) => {
    return traverse(0, nums, 0, 0);
};

const traverse = (start, nums, group1, group2) => {
    if (start >= nums.length) {
        return group1 === group2;
    } else {
        return traverse(start + 1, nums, group1 + nums[start], group2) || traverse(start + 1, nums, group1, group2 + nums[start]);
    }
};

console.log(splitArray([2, 2]));
console.log(splitArray([2, 3]));
console.log(splitArray([5, 2, 3]));
