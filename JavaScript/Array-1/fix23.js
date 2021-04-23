
// given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0
// return the changed array
const fix23 = (nums) => {
    if (nums[0] === 2 && nums[1] === 3) {
        nums[1] = 0;
    }
    
    if (nums[1] === 2 && nums[2] === 3) {
        nums[2] = 0;
    }

    return nums;
};

console.log(fix23([1, 2, 3]));
console.log(fix23([2, 3, 5]));
console.log(fix23([1, 2, 1]));
