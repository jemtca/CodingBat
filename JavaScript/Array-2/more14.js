
// given an array of ints, return true if the number of 1's is greater than the number of 4's
const more14 = (nums) => {
    let ones = 0;
    let fours = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] === 1) {
            ones++;
        }

        if (nums[i] === 4) {
            fours++;
        }
    }

    return ones > fours;
};

console.log(more14([1, 4, 1]));
console.log(more14([1, 4, 1, 4]));
console.log(more14([1, 1]));
