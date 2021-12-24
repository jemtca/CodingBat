
// return a version of the given array where all the 10's have been removed
// the remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0
// so {1, 10, 10, 2} yields {1, 2, 0, 0}
// you may modify and return the given array or make a new array
const withoutTen = (nums) => {
	const newArray = [];
	const nTen = nums.join(' ').match(/10/g);

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] !== 10) {
			newArray.push(nums[i]);
		}
	}

	if (nTen !== null) {
		for (let i = 0; i < nTen.length; i++) {
			newArray.push(0);
		}
	}

	return newArray;
};

console.log(withoutTen([1, 10, 10, 2]));
console.log(withoutTen([10, 2, 10]));
console.log(withoutTen([1, 99, 10]));
