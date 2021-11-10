
// given an array of ints, return true if the array contains no 1's and no 3's
const lucky13 = (nums) => {
    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 1 || nums[i] === 3) {
            return false;
        }
    }

    return true;
};

console.log(lucky13([0, 2, 4]));
console.log(lucky13([1, 2, 3]));
console.log(lucky13([1, 2, 4]));
