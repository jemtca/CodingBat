
// say that a 'clump' in an array is a series of 2 or more adjacent elements of the same value
// return the number of clumps in the given array
const countClumps = (nums) => {
    let total = 0;

    for (let i = 0; i < nums.length; i++) {
        if (i < nums.length - 2 && nums[i] === nums[i + 1] && nums[i + 1] !== nums[i + 2]) {
            total++;
        }

        if (i === nums.length - 2 && nums[i] === nums[i + 1]) {
            total++;
        }
    }

    return total;
};

console.log(countClumps([1, 2, 2, 3, 4, 4]));
console.log(countClumps([1, 1, 2, 1, 1]));
console.log(countClumps([1, 1, 1, 1, 1]));
