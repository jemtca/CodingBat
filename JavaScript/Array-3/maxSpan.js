
// consider the leftmost and righmost appearances of some value in an array
// we'll say that the 'span' is the number of elements between the two inclusive
// a single value has a span of 1
// returns the largest span found in the given array
const maxSpan = (nums) => {
    if (nums.length === 0) {
        return 0;
    } else if (nums.length === 1) {
        return 1;
    } else {
        let span = -1;

        for (let i = 0; i < nums.length; i++) {
            for (let j = nums.length - 1; j >= 0; j--) {
                if (nums[i] === nums[j] && span < j - i + 1) {
                    span = j - i + 1;
                } 
            }
        }

        return span;
    }
};

console.log(maxSpan([1, 2, 1, 1, 3]));
console.log(maxSpan([1, 4, 2, 1, 4, 1, 4]));
console.log(maxSpan([1, 4, 2, 1, 4, 4, 4]));
