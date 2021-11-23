
// given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both
const either24 = (nums) => {
	let two = false;
	let four = false;
	let result = true;


	for (let i = 0; i < nums.length - 1 && !(two && four); i++) {
		if (!two && nums[i] === 2 && nums[i + 1] === 2) {
			two = true;
		}

		if (!four && nums[i] === 4 && nums[i + 1] === 4) {
			four = true;
		}
	}

	if ((!two && !four) || (two && four)) {
	  result = false;
	}

	return result;
};

console.log(either24([1, 2, 2]));
console.log(either24([4, 4, 1]));
console.log(either24([4, 4, 1, 2, 2]));
