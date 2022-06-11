
// given two arrays, A and B, of non-negative int scores
// a 'special' score is one which is a multiple of 10, such as 40 or 90
// return the sum of largest special score in A and the largest special score in B
const scoresSpecial = (a, b) => {
	let largestA = 0;
	let largestB = 0;

	for (let i = 0; i < a.length; i++) {
		if (a[i] % 10 === 0 && a[i] > largestA) {
			largestA = a[i];
		}
	}

	for (let i = 0; i < b.length; i++) {
		if (b[i] % 10 === 0 && b[i] > largestB) {
			largestB = b[i];
		}
	}

	return largestA + largestB;
};

console.log(scoresSpecial([12, 10, 4], [2, 20, 30]));
console.log(scoresSpecial([20, 10, 4], [2, 20, 10]));
console.log(scoresSpecial([12, 11, 4], [2, 20, 31]));
