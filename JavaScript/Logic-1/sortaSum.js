
// given 2 ints, a and b, return their sum
// however, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20
const sortaSum = (a, b) => {
	return a + b >= 10 && a + b <= 19 ? 20 : a + b;
};

console.log(sortaSum(3, 4));
console.log(sortaSum(9, 4));
console.log(sortaSum(10, 11));
