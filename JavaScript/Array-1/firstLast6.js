
// given an array of ints, return true if 6 appears as either the first or last element in the array
// the array will be length 1 or more.
const firstLast6 = (nums) => {
    return nums[0] === 6 || nums[nums.length - 1] === 6 ? true : false;
};

console.log(firstLast6([1, 2, 6]));
console.log(firstLast6([6, 1, 2, 3]));
console.log(firstLast6([13, 6, 1, 2, 3]));
