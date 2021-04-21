
// given an int array, return a new array with double the length where its last element is the same as the original array, 
// and all the other elements are 0
// the original array will be length 1 or more
const makeLast = (nums) => {
    const newArray = [];

    for (let i = 0; i < nums.length * 2 - 1; i++) {
        newArray.push(0);
    }
    
    if (nums.length > 0) {
        newArray.push(nums[nums.length - 1]);
    }

    return newArray;
};

console.log(makeLast([4, 5, 6]));
console.log(makeLast([1, 2]));
console.log(makeLast([]));
