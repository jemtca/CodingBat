
// given a list of non-negative integers, return an integer list of the rightmost digits
const rightDigit = (nums) => {
    const newList = nums.map(n => n % 10);

    return newList;
};

console.log(rightDigit([1, 22, 93]));
console.log(rightDigit([16, 8, 886, 8, 1]));
console.log(rightDigit([10, 0]));
