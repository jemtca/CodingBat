
// given an int array length 2, return true if it contains a 2 or a 3
const has23 = (nums) => {
    return nums.includes(2) || nums.includes(3) ? true : false;
};

console.log(has23([2, 5]));
console.log(has23([4, 3]));
console.log(has23([4, 5]));
