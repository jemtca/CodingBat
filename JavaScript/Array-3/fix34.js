
// return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4
// do not move the 3's, but every other number may move
// the array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4
const fix34 = (nums) => {
    let length = nums.length - 1;
    let tempValue = -1;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 3) {
            for (let j = length; j >= 0; j--) {
                if (nums[j] === 4) {
                    tempValue = nums[i + 1];
                    nums[i + 1] = 4;
                    nums[j] = tempValue;
                    length = j - 1;
                    break;
                }
            }
        }
    }

    return nums;
};

console.log(fix34([1, 3, 1, 4]));
console.log(fix34([1, 3, 1, 4, 4, 3, 1]));
console.log(fix34([3, 2, 2, 4]));
