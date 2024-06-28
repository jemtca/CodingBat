
// given a list of integers, return a list of the integers, omitting any that are less than 0
const noNeg = (nums) => {
    const newList = nums.filter(n => n >= 0);

    return newList;
};

console.log(noNeg([1, -2]));
console.log(noNeg([-3, -3, 3, 3]));
console.log(noNeg([-1, -1, -1]));
