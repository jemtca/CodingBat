
// given an array of ints, is it possible to divide the ints into two groups,
// so that the sum of one group is a multiple of 10, and the sum of the other group is odd
// every int must be in one group or the other
// write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10()
const splitOdd10 = (nums) => {
    return traverse(0, nums, 0, 0);
};

const traverse = (start, nums, group1, group2) => {
    if (start >= nums.length) {
        return (group1 % 10 === 0 && group2 % 2 !== 0) || (group1 % 2 !== 0 && group2 % 10 === 0);
    } else {
        return traverse(start + 1, nums, group1 + nums[start], group2) || traverse(start + 1, nums, group1, group2 + nums[start]);
    }
};

console.log(splitOdd10([5, 5, 5]));
console.log(splitOdd10([5, 5, 6]));
console.log(splitOdd10([5, 5, 6, 1]));
