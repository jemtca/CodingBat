
// we'll say that a positive int n is 'endy' if it is in the range 0..10 or 90..100 (inclusive)
// given an array of positive ints, return a new array of length 'count' containing the first endy numbers from the original array
const copyEndy = (nums, count) => {
    let newArray = [];
    let temp = 0;

    for (let i = 0; i < nums.length; i++) {
        if ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
            newArray.push(nums[i]);
            temp++;
        }

        if (temp === count) {
            break;
        }
    }

    return newArray;
};

console.log(copyEndy([9, 11, 90, 22, 6], 2));
console.log(copyEndy([9, 11, 90, 22, 6], 3));
console.log(copyEndy([12, 1, 1, 13, 0, 20], 2));
