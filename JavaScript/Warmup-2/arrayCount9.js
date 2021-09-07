
// given an array of ints, return the number of 9's in the array
const arrayCount9 = (nums) => {
    let count = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 9) {
            count++;
        }
    }

    return count;
};

console.log(arrayCount9([1, 2, 9]));
console.log(arrayCount9([1, 9, 9]));
console.log(arrayCount9([1, 9, 9, 3, 9]));
