
// given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other
const haveThree = (nums) => {
	let count = 0;

	for (let i = 0; i < nums.length; i++) {
		if ((i < nums.length - 1 && nums[i] === 3 && nums[i + 1] === 3) || count > 3) {
			return false;
		}

		if (nums[i] === 3) {
			count++;
		}
	}

	return count === 3;
};

console.log(haveThree([3, 1, 3, 1, 3]));
console.log(haveThree([3, 1, 3, 3]));
console.log(haveThree([3, 4, 3, 3, 4]));
