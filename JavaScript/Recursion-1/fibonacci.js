
// the fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition
// the first two values in the sequence are 0 and 1 (essentially 2 base cases)
// each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on
// define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence
const fibonacci = (n) => {
	if (n < 2) {
		return n;
	}

	return fibonacci(n - 1) + fibonacci(n - 2);
};

console.log(fibonacci(0));
console.log(fibonacci(1));
console.log(fibonacci(2));
