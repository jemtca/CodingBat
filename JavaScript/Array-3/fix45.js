
// return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5
// do not move the 4's, but every other number may move
// the array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4
// in this version, 5's may appear anywhere in the original array
const fix45 = (nums) => {
	let newIndex = 0;

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] === 4) {
			for (let j = 0; j < nums.length; j++) {
				if ((j === 0 && nums[j] === 5) || (nums[j] === 5 && nums[j - 1] !== 4)) {
					let temp = nums[i + 1];
					nums[i + 1] = 5;
					nums[j] = temp;
					i++;
					break;
				}
			}
		}
	}

	return nums;
};

console.log(fix45([5, 4, 9, 4, 9, 5]));
console.log(fix45([1, 4, 1, 5]));
console.log(fix45([1, 4, 1, 5, 5, 4, 1]));
