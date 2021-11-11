
// given an array of ints, return true if the sum of all the 2's in the array is exactly 8
const sum28 = (nums) => {
    let total = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 2) {
            total = total + nums[i];
        }
    }

    return total === 8;
};

console.log(sum29([2, 3, 2, 2, 4, 2]));
console.log(sum29([2, 3, 2, 2, 4, 2, 2]));
console.log(sum29([1, 2, 3, 4]));
