
// given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}
const reverse3 = (nums) => {
    const newArray = [];

    newArray.push(nums[nums.length - 1]);
    newArray.push(nums[1]);
    newArray.push(nums[0]);

    return newArray;
};

console.log(reverse3([1, 2, 3]));
console.log(reverse3([5, 11, 9]));
console.log(reverse3([7, 0, 0]));
