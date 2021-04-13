
// given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value
// return the changed array
const maxEnd3 = (nums) => {
    const newArray = [];
    const larger = Math.max(nums[0], nums[nums.length - 1]);

    newArray.push(larger);
    newArray.push(larger);
    newArray.push(larger);

    return newArray;
};

console.log(maxEnd3([1, 2, 3]));
console.log(maxEnd3([11, 5, 9]));
console.log(maxEnd3([2, 11, 3]));
