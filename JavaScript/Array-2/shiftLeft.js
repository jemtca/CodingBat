
// return an array that is 'left shifted' by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}
// you may modify and return the given array, or return a new array
const shiftLeft = (nums) => {
	const newArray = [];
	let firstEle;

	if (nums.length > 0) {
		firstEle = nums[0];
	}

	for (let i = 0; i < nums.length - 1; i++) {
		newArray.push(nums[i + 1]);
	}

	if (nums.length > 0) {
		newArray.push(firstEle);
	}

	return newArray;
};

console.log(shiftLeft([6, 2, 5, 3]));
console.log(shiftLeft([1, 2]));
console.log(shiftLeft([1]));
