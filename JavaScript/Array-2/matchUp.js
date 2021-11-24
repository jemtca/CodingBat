
// given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index)
// return the count of the number of times that the two elements differ by 2 or less, but are not equal
const matchUp = (nums1, nums2) => {
	let count = 0;

	for (let i = 0; i < nums1.length; i++) {
		if (nums1[i] !== nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
			count++;
		}
	}

	return count;
};

console.log(matchUp([1, 2, 3], [2, 3, 10]));
console.log(matchUp([1, 2, 3], [2, 3, 5]));
console.log(matchUp([1, 2, 3], [2, 3, 3]));
