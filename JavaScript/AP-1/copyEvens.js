
// given an array of positive ints, return a new array of length 'count' containing the first even numbers from the original array
// the original array will contain at least 'count' even numbers
const copyEvens = (nums, count) => {
    let newArray = [];
    let temp = 0;

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] % 2 === 0) {
            newArray.push(nums[i]);
            temp++;
        }

        if (temp === count) {
            break;
        }
            
    }

    return newArray;
};

console.log(copyEvens([3, 2, 4, 5, 8], 2));
console.log(copyEvens([3, 2, 4, 5, 8], 3));
console.log(copyEvens([6, 1, 2, 4, 5, 8], 3));
