
// given a list of integers,
// return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6
const square56 = (nums) => {
    const newList = nums.map(n => (n * n) + 10).filter(n => n % 10 !== 5 && n % 10 !== 6);

    return newList;
};

console.log(square56([3, 1, 4]));
console.log(square56([1]));
console.log(square56([2]));
