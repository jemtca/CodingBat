
// we'll say that a 1 immediately followed by a 3 in an array is an 'unlucky' 1
// return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array
const unlucky1 = (nums) => {
    if (nums.length > 1) {
        if (nums[0] === 1 && nums[1] === 3 || nums[1] === 1 && nums[2] === 3) {
            return true;
        }

        if (nums[nums.length - 2] === 1 && nums[nums.length - 1] === 3) {
            return true;
        }
    }

    return false;
};

console.log(unlucky1([1, 3, 4, 5]));
console.log(unlucky1([2, 1, 3, 4, 5]));
console.log(unlucky1([1, 1, 1]));
