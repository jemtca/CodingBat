
// consider the series of numbers beginning at start and running up to but not including end
// so for example start=1 and end=5 gives the series 1, 2, 3, 4
// return a new String[] array containing the string form of these numbers
// for multiples of 3, use 'Fizz' instead of the number
// for multiples of 5 use 'Buzz'
// for multiples of both 3 and 5 use 'FizzBuzz'
const fizzBuzz = (start, end) => {
	const newArray = [];

	for (let i = start; i < end; i++) {
		if (i % 3 === 0 && i % 5 === 0) {
			newArray.push('FizzBuzz');
		} else if (i % 3 === 0) {
			newArray.push('Fizz');
		} else if (i % 5 === 0) {
			newArray.push('Buzz');
		} else {
			newArray.push(i.toString());
		}
	}

	return newArray;
};

console.log(fizzBuzz(1, 6));
console.log(fizzBuzz(1, 8));
console.log(fizzBuzz(1, 11));
