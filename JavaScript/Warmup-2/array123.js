
// given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere
const array123 = (nums) => {
    let found = false;

    for (let i = 0; i < nums.length - 2 && !found; i++) {
        if (nums[i] === 1 && nums[i + 1] === 2 && nums[i + 2] === 3) {
            found = true;
        }
    }

    return found;
};

console.log(array123([1, 1, 2, 3, 1]));
console.log(array123([1, 1, 2, 4, 1]));
console.log(array123([1, 1, 2, 1, 2, 3]));
