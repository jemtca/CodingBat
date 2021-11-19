
// we'll say that a value is 'everywhere' in an array if for every pair of adjacent elements in the array, at least one of the pair is that value
// return true if the given value is everywhere in the array
const isEverywhere = (nums, val) => {
	let result = true;

	for (let i = 0; i < nums.length - 1; i++) {
		if (nums[i] !== val && nums[i + 1] !== val) {
			result = false;
			break;
		}
	}

	return result;
};

console.log(isEverywhere([1, 2, 1, 3], 1));
console.log(isEverywhere([1, 2, 1, 3], 2));
console.log(isEverywhere([1, 2, 1, 3, 4], 1));
