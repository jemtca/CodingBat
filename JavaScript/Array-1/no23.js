
// given an int array length 2, return true if it does not contain a 2 or 3
const no23 = (nums) => {
    return nums[0] !== 2 && nums[0] !== 3 && nums[1] !== 2 && nums[1] !== 3 ? true : false;
};

console.log(no23([4, 5]));
console.log(no23([4, 2]));
console.log(no23([3, 5]));
