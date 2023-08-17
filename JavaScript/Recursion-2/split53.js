
// given an array of ints, is it possible to divide the ints into two groups,
// so that the sum of the two groups is the same, with these constraints:
// all the values that are multiple of 5 must be in one group,
// and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other
const split53 = (nums) => {
    return traverse(0, nums, 0, 0);
};

const traverse = (start, nums, group1, group2) => {
    if (start >= nums.length) {
        return group1 === group2;
    } else {
        if (nums[start] % 5 === 0) {
            return traverse(start + 1, nums, group1 + nums[start], group2);
        } else if (nums[start] % 5 !== 0 && nums[start] % 3 === 0) {
            return traverse(start + 1, nums, group1, group2 + nums[start]);
        } else {
            return traverse (start + 1, nums, group1 + nums[start], group2) || traverse(start + 1, nums, group1, group2 + nums[start]);
        }
    }
};

console.log(split53([1, 1]));
console.log(split53([1, 1, 1]));
console.log(split53([2, 4, 2]));
