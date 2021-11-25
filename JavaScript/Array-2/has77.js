
// given an array of ints, return true if the array contains two 7's next to each other,
// or there are two 7's separated by one element, such as with {7, 1, 7}
const has77 = (nums) => {
	let result = false;

	for (let i = 0; i < nums.length - 1; i++) {
		if ((nums[i] === 7 && nums[i + 1] === 7) || (i < nums.length - 2 && nums[i] === 7 && nums[i + 2] === 7)) {
			result = true;
			break;
		}
	}

	return result;
};

console.log(has77([1, 7, 7]));
console.log(has77([1, 7, 1, 7]));
console.log(has77([1, 7, 1, 1, 7]));
