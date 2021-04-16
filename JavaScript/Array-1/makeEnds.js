
// given an array of ints, return a new array length 2 containing the first and last elements from the original array
// the original array will be length 1 or more
const makeEnds = (nums) => {
    const newArray = [];

    newArray.push(nums[0]);
    newArray.push(nums[nums.length - 1]);

    return newArray;
};

console.log(makeEnds([1, 2, 3]));
console.log(makeEnds([1, 2, 3, 4]));
console.log(makeEnds([7, 4, 6, 2]));
