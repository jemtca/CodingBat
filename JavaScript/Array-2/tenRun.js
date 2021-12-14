
// for each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10
// so {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}
const tenRule = (nums) => {
	let mTen = false;
	let ele = 0;

	for (let i = 0; i < nums.length; i++) {
		if (nums[i] % 10 !== 0 && !mTen) {
			continue;
		} else if (nums[i] % 10 === 0) {
			mTen = true;
			ele = nums[i];
		} else {
			nums[i] = ele;
		}
	}

	return nums;
};

console.log(tenRule([2, 10, 3, 4, 20, 5]));
console.log(tenRule([10, 1, 20, 2]));
console.log(tenRule([10, 1, 9, 20]));
