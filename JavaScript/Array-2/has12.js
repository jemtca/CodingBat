
// given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array
const has12 = (nums) => {
	let one = false;
	let two = false;

	for (let i = 0; i < nums.length && !(one && two); i++) {
		if (nums[i] === 1) {
			one = true;
		}

		if (one && nums[i] === 2) {
			two = true;
		}
	}

	return one && two;
};

console.log(has12([1, 3, 2]));
console.log(has12([3, 1, 2]));
console.log(has12([3, 1, 4, 5, 2]));
