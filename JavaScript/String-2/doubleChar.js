
// given a string, return a string where for every char in the original, there are two chars
const doubleChar = (str) => {
	let newStr = '';

	for (let i = 0; i < str.length; i++) {
		newStr = newStr + str[i] + str[i];
	}

	return newStr;
};

console.log(doubleChar('The'));
console.log(doubleChar('AAbb'));
console.log(doubleChar('Hi-There'));
