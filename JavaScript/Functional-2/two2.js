
// given a list of non-negative integers,
// return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2
const two2 = (nums) => {
    const newList1 = nums.map(n => n * 2);
    const newList2 = newList1.filter(n => n % 10 !== 2);

    return newList2;
};

console.log(two2([1, 2, 3]));
console.log(two2([2, 6, 11]));
console.log(two2([0]));
