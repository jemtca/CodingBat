
// given a list of integers, return a list where each integer is multiplied with itself
const square = (nums) => {
    const newList = nums.map(n => n * n);

    return newList;
};

console.log(square([1, 2, 3]));
console.log(square([6, 8, -6, -8, 1]));
console.log(square([]));
