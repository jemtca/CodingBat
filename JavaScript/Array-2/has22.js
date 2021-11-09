
// given an array of ints, return true if the array contains a 2 next to a 2 somewhere
const has22 = (nums) => {
	for (let i = 0; i < nums.length - 1; i++) {
		if (nums[i] === 2 && nums[i + 1] === 2) {
			return true;
		}
	}

	return false;
};

console.log(has22([1, 2, 2]));
console.log(has22([1, 2, 1, 2]));
console.log(has22([2, 1, 2]));
