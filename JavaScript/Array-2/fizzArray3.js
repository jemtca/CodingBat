
// given start and end numbers, return a new array containing the sequence of integers from start up to but not including end
// so start=5 and end=10 yields {5, 6, 7, 8, 9}
// the end number will be greater or equal to the start number
// note that a length-0 array is valid
const fizzArray3 = (start, end) => {
	const array = [];

	for (let i = start; i < end; i++) {
		array.push(i);
	}

	return array;
};

console.log(fizzArray3(5, 10));
console.log(fizzArray3(11, 18));
console.log(fizzArray3(1, 3));
