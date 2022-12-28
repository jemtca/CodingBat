
// given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target,
// with this additional constraint: if there are numbers in the array that are adjacent and the identical value,
// they must either all be chosen, or none of them chosen
// for example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group
// (one loop can be used to find the extent of the identical values)
const groupSumClump = (start, nums, target) => {
    if (start >= nums.length) {
        return target === 0;
    } else {
        let end = start;

        while(end < nums.length && nums[end] === nums[start]) {
            end++;
        }

        let length = end - start;

        return groupSumClump(end, nums, target - (nums[start] * length)) || groupSumClump(end, nums, target);
    }
};

console.log(groupSumClump(0, [2, 4, 8], 10));
console.log(groupSumClump(0, [1, 2, 4, 8, 1], 14));
console.log(groupSumClump(0, [2, 4, 4, 8], 14));
