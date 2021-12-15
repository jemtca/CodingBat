
// given a non-empty array of ints,
// return a new array containing the elements from the original array that come before the first 4 in the original array
// the original array will contain at least one 4
const pre4 = (nums) => {
	const newArray = [];

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] === 4) {
			break;
		} else {
			newArray.push(nums[i]);
		}
	}

	return newArray;
};

console.log(pre4([1, 2, 4, 1]));
console.log(pre4([3, 1, 4]));
console.log(pre4([1, 4, 4]));
