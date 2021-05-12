
// given an array of ints, swap the first and last elements in the array. Return the modified array
// the array length will be at least 1
const swapEnds = (nums) => {
    if (nums.length === 1) {
        return nums;
    }

    let temp = nums[nums.length - 1];
    nums[nums.length - 1] = nums[0];
    nums[0] = temp;

    return nums;
};

console.log(swapEnds([1, 2, 3, 4]));
console.log(swapEnds([1, 2, 3]));
console.log(swapEnds([8, 6, 7, 9, 5]));
