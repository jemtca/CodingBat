
// given an array of ints, return the number of times that two 6's are next to each other in the array
// also count instances where the second "6" is actually a 7
const array667 = (nums) => {
    let count = 0;

    for (let i = 0; i < nums.length - 1; i++ ) {
        if (nums[i] === 6 && (nums[i + 1] === 6 || nums[i + 1] === 7)) {
            count++;
        }
    }

    return count;
};

console.log(array667([6, 6, 2]));
console.log(array667([6, 6, 2, 6]));
console.log(array667([6, 7, 2, 6]));
