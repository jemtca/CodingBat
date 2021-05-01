
// given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array
// the original array will be length 2 or more
const makeMiddle = (nums) => {
    const newArray = [];

    newArray.push(nums[(nums.length / 2) - 1]);
    newArray.push(nums[nums.length / 2]);

    return newArray;
};

console.log(makeMiddle([1, 2, 3, 4]));
console.log(makeMiddle([7, 1, 2, 3, 4, 9]));
console.log(makeMiddle([1, 2]));
