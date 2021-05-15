
// given an int array of any length, return a new array of its first 2 elements
// if the array is smaller than length 2, use whatever elements are present
const frontPiece = (nums) => {
    if (nums.length > 1) {
        const newArray = [];

        newArray.push(nums[0]);
        newArray.push(nums[1]);

        return newArray;
    }

    return nums;
};

console.log(frontPiece([1, 2, 3]));
console.log(frontPiece([1, 2]));
console.log(frontPiece([1]));
