
// return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array
// if there is no odd value to the right of the zero, leave the zero as a zero
const zeroMax = (nums) => {
	const newArray = [];

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] === 0) {
			if (i < nums.length - 1) {
				let odd = 0;

				for (let j = i + 1; j < nums.length; j++) {
					if (nums[j] % 2 !== 0 && nums[j] > odd) {
						odd = nums[j];
					}
				}

				newArray.push(odd);
			} else {
				newArray.push(0);
			}
		} else {
			newArray.push(nums[i]);
		}
	}

	return newArray;
};

console.log(zeroMax([0, 5, 0, 3]));
console.log(zeroMax([0, 4, 0, 3]));
console.log(zeroMax([0, 1, 0]));
