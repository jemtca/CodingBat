
// we'll say that an element in an array is 'alone' if there are values before and after it, and those values are different from it
// return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger
const notAlone = (nums, val) => {
	for (let i = 0; i < nums.length; i++) {
		if (nums[i] === val && i > 0 && i < nums.length - 1) {
			if (nums[i - 1] !== val && nums[i + 1] !== val) {
				nums[i] = Math.max(nums[i - 1], nums[i + 1]);
			}
		}
	}

	return nums;
};

console.log(notAlone([1, 2, 3], 2));
console.log(notAlone([1, 2, 3, 2, 5, 2], 2));
console.log(notAlone([[3, 4], 3]));
