
// given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1
// additionally the 271 counts even if the '1' differs by 2 or less from the correct value
const has271 = (nums) => {
    let result = false;
    let found = false;

    if (nums.length > 2) {
        for (let i = 0; i < nums.length - 2 && !found; i++ ) {
            if (nums[i + 1] === (nums[i] + 5) && Math.abs(nums[i + 2] - (nums[i] - 1)) <= 2) {
                result = true;
                found = true;
            }
        }
    }
    
    return result;
};

console.log(has271([1, 2, 7, 1]));
console.log(has271([1, 2, 8, 1]));
console.log(has271([2, 7, 1]));
