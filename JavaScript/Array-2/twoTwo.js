
// given an array of ints, return true if every 2 that appears in the array is next to another 2
const twoTwo = (nums) => {
	let result = true;

	for (let i = 0; i < nums.length; i++) {
		if (nums.length === 1 && nums[i] === 2) {
			return false;
		} else if (i === 0 && nums[i] === 2 && nums[i + 1] !== 2) {
			return false;
		} else if (i === nums.length - 1 && nums[i] === 2 && nums[i - 1] !== 2) {
			return false;
		} else if (i > 0 && (nums[i] === 2 && nums[i - 1] !== 2) && (nums[i] === 2 && nums[i + 1] !== 2)) {
			return false;
		}
	}

	return result;
};

console.log(twoTwo([4, 2, 2, 3]));
console.log(twoTwo([2, 2, 4]));
console.log(twoTwo([2, 2, 4, 2]));
