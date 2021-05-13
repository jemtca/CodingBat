
// given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array
// the array length will be at least 3
const midThree = (nums) => {
    if (nums.length === 3) {
        return nums;
    }

    const newArray = [];

    newArray.push(nums[Math.floor(nums.length / 2) - 1]);
    newArray.push(nums[Math.floor(nums.length / 2)]);
    newArray.push(nums[Math.floor(nums.length / 2) + 1]);

    return newArray;
};

console.log(midThree([1, 2, 3, 4, 5]));
console.log(midThree([8, 6, 7, 5, 3, 0, 9]));
console.log(midThree([1, 2, 3]));
