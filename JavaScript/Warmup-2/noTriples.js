
// given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array
// return true if the array does not contain any triples
const noTriples = (nums) => {

    let result = true;
    let found = false;

    if (nums.length > 2) {
        for (let i = 0; i < nums.length - 2 && !found; i++) {
            if (nums[i] === nums[i + 1] && nums[i] === nums[i + 2]) {
                found = true;
                result = false;
            }
        }
    }

    return result;

};

console.log(noTriples([1, 1, 2, 2, 1]));
console.log(noTriples([1, 1, 2, 2, 2, 1]));
console.log(noTriples([1, 1, 1, 2, 2, 2, 1]));
