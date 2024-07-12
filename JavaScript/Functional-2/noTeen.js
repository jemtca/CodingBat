
// given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive
const noTeen = (nums) => {
    const newList = nums.filter(n => n < 13 || n > 19);

    return newList;
};

console.log(noTeen([12, 13, 19, 20]));
console.log(noTeen([1, 14, 1]));
console.log(noTeen([15]));
