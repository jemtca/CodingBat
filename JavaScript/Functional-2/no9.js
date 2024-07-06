
// given a list of non-negative integers, return a list of those numbers except omitting any that end with 9
const no9 = (nums) => {
    const newList = nums.filter(n => n % 10 !== 9);

    return newList;
};

console.log(no9([1, 2, 19]));
console.log(no9([9, 19, 29, 3]));
console.log(no9([1, 2, 3]));
