
// given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters
// return 0 if there are no digits in the string
const sumDigits = (str) => {
	let sum = 0;

	for (let i = 0; i < str.length; i++) {
		if (!isNaN(str[i])) {
			sum = sum + Number(str[i]);
		}
	}

	return sum;
};

console.log(sumDigits('aa1bc2d3'));
console.log(sumDigits('aa11b33'));
console.log(sumDigits('Chocolate'));
