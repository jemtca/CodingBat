
// given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10
const math1 = (nums) => {
    const newList= nums.map(n => (n + 1) * 10);

    return newList;
};

console.log(math1([1, 2, 3]));
console.log(math1([6, 8, 6, 8, 1]));
console.log(math1([10]));
