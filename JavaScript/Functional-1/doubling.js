
// given a list of integers, return a list where each integer is multiplied by 2
const doubling = (nums) => {
    const newList = nums.map(n => n * 2);

    return newList;
};

console.log(doubling([1, 2, 3]));
console.log(doubling([6, 8, 6, 8, -1]));
console.log(doubling([]));
