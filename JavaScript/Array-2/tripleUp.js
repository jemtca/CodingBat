
// return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25
const tripleUp = (nums) => {
	for (let i = 0; i < nums.length - 2; i++) {
		if (nums[i + 1] === nums[i] + 1 && nums[i + 2] === nums[i + 1] + 1) {
			return true;
		}
	}

	return false;
};

console.log(tripleUp([1, 4, 5, 6, 2]));
console.log(tripleUp([1, 2, 3]));
console.log(tripleUp([1, 2, 4]));
