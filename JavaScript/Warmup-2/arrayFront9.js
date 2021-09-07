
// given an array of ints, return true if one of the first 4 elements in the array is a 9
// the array length may be less than 4
const arrayFront9 = (nums) => {
    let answer = false;
    let found = false;

    for (let i = 0; i < nums.length && !found; i++) {
        if (i < 4 && nums[i] === 9) {
            answer = true;
            found = true;
        }
    }

    return answer;
};

console.log(arrayFront9([1, 2, 9, 3, 4]));
console.log(arrayFront9([1, 2, 3, 4, 9]));
console.log(arrayFront9([1, 2, 3, 4, 5]));
