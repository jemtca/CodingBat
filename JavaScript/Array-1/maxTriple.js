
// given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest
// the array length will be a least 1
const maxTriple = (nums) => {
    if (nums.length === 1) {
        return nums[0];
    } else if (nums.length === 2) {
        return Math.max(nums[0], nums[1]);
    } else {
        const first = nums[0];
        const middle = nums[Math.floor(nums.length / 2)];
        const last = nums[nums.length - 1];

        return Math.max(middle, Math.max(first, last));
    }
};

console.log(maxTriple([1, 2, 3]));
console.log(maxTriple([1, 5, 3]));
console.log(maxTriple([5, 2, 3]));
