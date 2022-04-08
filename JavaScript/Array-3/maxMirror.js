
// we'll say that a 'mirror' section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order
// for example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part)
// return the size of the largest mirror section found in the given array
const maxMirror = (nums) => {
    let count = 0;
    let max = 0;
    
    for (let i = 0; i < nums.length; i++) {
        count = 0;

        for (let j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
            if (nums[i + count] === nums[j]) {
                count++;
            } else {
                if (count > 0) {
                    max = Math.max(count, max);
                    count = 0;
                }
            }
        }
        
        max = Math.max(count, max);
    }

    return max;
};

console.log(maxMirror([1, 2, 3, 8, 9, 3, 2, 1]));
console.log(maxMirror([1, 2, 1, 4]));
console.log(maxMirror([7, 1, 2, 9, 7, 2, 1]));
