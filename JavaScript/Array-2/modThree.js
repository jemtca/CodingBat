
// given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other
const modThree = (nums) => {
	let result = false;

	for (let i = 0; i < nums.length - 2; i++) {
		if (nums[i] % 2 === 0 && nums[i + 1] % 2 === 0 && nums[i + 2] % 2 === 0) {
			return true;
		}

		if (nums[i] % 2 !== 0 && nums[i + 1] % 2 !== 0 && nums[i + 2] % 2 !== 0) {
			return true;
		}
	}

	return result;
};

console.log(modThree([2, 1, 3, 5]));
console.log(modThree([2, 1, 2, 5]));
console.log(modThree([2, 4, 2, 5]));
