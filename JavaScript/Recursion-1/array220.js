
// given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10
// we'll use the convention of considering only the part of the array that begins at the given index
// in this way, a recursive call can pass index+1 to move down the array
// the initial call will pass in index as 0
const array220 = (nums, index) => {
    if (nums.length < 1 || index === nums.length - 1) {
        return false;
    }

    return nums[index] * 10 === nums[index + 1] ? true : array220(nums, index + 1);
};

console.log(array220([1, 2, 20], 0));
console.log(array220([3, 30], 0));
console.log(array220([3], 0));
