
// given an array of ints, return true if it contains no 1's or it contains no 4's
const no14 = (nums) => {
	let one = false;
	let four = false;

	for (let i = 0; i < nums.length && !(one && four); i++) {
		if (nums[i] === 1) {
			one = true;
		}

		if (nums[i] === 4) {
			four = true;
		}
	}

	return !(one && four);
};

console.log(no14([1, 2, 3]));
console.log(no14([1, 2, 3, 4]));
console.log(no14([2, 3, 4]));
